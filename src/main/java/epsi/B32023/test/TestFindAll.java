package epsi.B32023.test;

import epsi.B32023.BO.Fournisseur;
import epsi.B32023.DAL.FournisseurJDBCDAO;

import java.sql.SQLException;
import java.util.List;

public class TestFindAll {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestFindAll() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public List<Fournisseur> FindAll() throws SQLException {
        return this.fournisseurJDBCDAO.findAll();
    }
}
