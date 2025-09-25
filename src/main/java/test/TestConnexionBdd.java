package test;

import java.sql.Connection;
import java.util.ArrayList;

import database.Connexionbdd;
import database.DaoCheval;
import database.DaoVente;

public class TestConnexionBdd {

    public static void main (String args[]) {

        Connection cnx = Connexionbdd.ouvrirConnexion();
        //Test BDD DaoCheval
        System.out.println ("nombre de chevaux = " + DaoCheval.getLesChevaux(cnx).size());
        System.out.println ("Le cheval = " + DaoCheval.getLeCheval(cnx, 1));
        
        //Test BDD DaoVente
        System.out.println ("nombre de ventes = " + DaoVente.getLesVentes(cnx).size());
        System.out.println ("La vente " + DaoVente.getUneVente(cnx, 1));
    }
}