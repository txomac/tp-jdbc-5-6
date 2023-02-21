package epsi.B32023.test;

import epsi.B32023.BO.Fournisseur;
import epsi.B32023.DAL.FournisseurJDBCDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestUpdate() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Update(Fournisseur oldFournisseur, Fournisseur newFournisseur) throws SQLException {
        this.fournisseurJDBCDAO.update(oldFournisseur, newFournisseur);
    }
}

