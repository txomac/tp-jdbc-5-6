package epsi.B32023.test;

import epsi.B32023.BO.Fournisseur;
import epsi.B32023.DAL.FournisseurJDBCDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestInsertion() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Insert(Fournisseur fournisseur) throws SQLException {
        this.fournisseurJDBCDAO.insert(fournisseur);
    }
}

