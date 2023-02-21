package epsi.B32023.test;

import epsi.B32023.DAL.FournisseurJDBCDAO;

import java.sql.SQLException;

public class TestDelete {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestDelete() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Delete(int fournisseurId) throws SQLException {
        this.fournisseurJDBCDAO.delete(fournisseurId);
    }
}
