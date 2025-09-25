package test;

import model.Cheval;
import model.Race;

public class TestCheval {

    public static void main (String args[]){

        // création d'une instance de cheval nommée c
        Cheval c = new Cheval();
        c.setId(2);
        c.setNom("Houri");

        // création d'une instance de race nommée r
        Race r = new Race();
        r.setId(1);
        r.setNom("pur-sang");

        //affectation de  la race au cheval grâce à la relation ManyToOne
        c.setRace(r);

        // Affichage des informations dans la console
        //voir notamment du nom de la race du cheval
        System.out.println("Cheval : " + c.getId() + " " + c.getNom() + " "
                + c.getRace().getId() + " " + c.getRace().getNom());
    }
}
