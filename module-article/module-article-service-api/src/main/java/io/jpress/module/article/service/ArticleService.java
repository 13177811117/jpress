/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.module.article.service;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.db.model.Columns;
import io.jpress.module.article.model.Article;

import java.util.List;

public interface ArticleService {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public Article findById(Object id);


    /**
     * find all model
     *
     * @return all <Article
     */
    public List<Article> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * 删除多个id
     *
     * @param ids
     * @return
     */
    public boolean deleteByIds(Object... ids);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(Article model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(Article model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(Article model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(Article model);


    public void join(Page<? extends Model> page, String joinOnField);

    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);

    public void join(Page<? extends Model> page, String joinOnField, String joinName);

    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField);

    public void join(List<? extends Model> models, String joinOnField, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField, String joinName);

    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);

    public void join(Model model, String joinOnField);

    public void join(Model model, String joinOnField, String[] attrs);

    public void join(Model model, String joinOnField, String joinName);

    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);

    public void keep(List<? extends Model> models, String... attrs);


    public Page<Article> paginate(int page, int pagesize);

    public Page<Article> paginateByCategoryId(int page, int pagesize, long categoryId);

    public Page<Article> paginateByCategoryIds(int page, int pagesize, Long[] categoryIds);

    public long doGetIdBySaveOrUpdateAction(Article article);


    public void doUpdateCategorys(long articleId, Long[] categoryIds);


    public boolean doChangeStatus(long id, String status);


    public int findCountByStatus(String status);


    public Article findFirstBySlug(String slug);


    public Article findNextById(long id);


    public Article findPreviousById(long id);


    public List<Article> findListByColumns(Columns columns, String orderBy, Integer count);


    public List<Article> findRelevantListByArticleId(long ArticleId, String status, Integer count);


    public Page<Article> _paginateByStatus(int page, int pagesize, String title, Long categoryId, String status);

    public Page<Article> _paginateWithoutTrash(int page, int pagesize, String title, Long categoryId);

    public Page<Article> _paginateByUserId(int page, int pagesize, Long userId);


    public Page<Article> paginateInNormal(int page, int pagesize);

    public Page<Article> paginateInNormal(int page, int pagesize, String orderBy);

    public Page<Article> paginateByCategoryIdInNormal(int page, int pagesize, long categoryId, String orderBy);

    public void doIncArticleViewCount(long articleId);

    public void doIncArticleCommentCount(long articleId);

    public boolean isOwn(Article article, long userId);


}