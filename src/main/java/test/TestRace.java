package test;

import model.Cheval;
import model.Race;

public class TestRace
{
    public static void main (String args[]){
        // instantiation d'une race
        Race r = new Race();
        r.setId(4);
        r.setNom("Andalou");

        // instanciation de 2 chevaux c1 et c2
        // ajout des chevaux c1 et c2 à l'arraylist des chevaux grâce
        // à la relation OneToMany
        Cheval c1 = new Cheval();
        c1.setId(1);
        c1.setNom("Eclipse");
        r.addCheval(c1);

        Cheval c2 = new Cheval();
        c2.setId(7);
        c2.setNom("Comète");
        r.addCheval(c2);

        //Affichage des informations de la race
        System.out.println("La race est " + r.getId() + " " + r.getNom() + " et contient " + r.getLesChevaux().size() + " chevaux" );
        System.out.println("Liste des chevaux de la race : ");

		// Affichage des informations sur chevaux liées à la race
        for (Cheval c : r.getLesChevaux()){
            System.out.println("Cheval numéro : " + c.getId() + " " + c.getNom());
        }
    }
}
