package epsi.B32023.DAL;

import epsi.B32023.BO.Fournisseur;

import java.util.List;
import java.sql.SQLException;

public interface FournisseurDAO {
    void insert(Fournisseur fournisseur) throws SQLException;

    List<Fournisseur> findAll() throws SQLException;

    void update(Fournisseur oldFournisseur, Fournisseur newFournisseur) throws SQLException;

    void delete(int fournisseurId) throws SQLException;
}

