package epsi.B32023.DAL;

import epsi.B32023.BO.Article;
import epsi.B32023.BO.Fournisseur;

import java.sql.SQLException;
import java.util.List;

public interface ArticleDAO {
    void insert(Article article) throws SQLException;

    List<Article> findAll() throws SQLException;

    void update(Article oldArticle, Article newArticle) throws SQLException;

    void delete(int articleId) throws SQLException;
}
