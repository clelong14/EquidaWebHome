/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.CategVente;
import model.Vente;

/**
 *
 * @author sio2
 */
public class TestCategVente {
    
    public static void main (String args[]){
        // instantiation d'une race
        CategVente c = new CategVente();
        c.setCode(4);
        c.setLibelle ("Discipline");

        // instanciation de 2 chevaux c1 et c2
        // ajout des chevaux c1 et c2 à l'arraylist des chevaux grâce
        // à la relation OneToMany
        Vente v1 = new Vente();
        v1.setId(1);
        v1.setNom("Gagnant en 2025, pret a courir");
        v1.setDateDebutVente(LocalDate.of(2024, 5, 25));
        c.addVente(v1);

        Vente v2 = new Vente();
        v2.setId(7);
        v2.setNom("Pouliniere confirmee, budget 25 000 euro, transport inclus");
        v2.setDateDebutVente(LocalDate.of(2024, 6, 15));
        c.addVente(v2);

        //Affichage des informations de la race
        System.out.println("La categorie de vente est " + c.getLibelle() + " et contient " + c.getLesVentes().size() + " vente" );
        System.out.println("Liste des chevaux de la race : ");

		// Affichage des informations sur chevaux liées à la race
        for (Vente v : c.getLesVentes()){
            System.out.println("La vente numero : " + v.getId() + " a comme nom '" + v.getNom() + "' et a debutee en " + v.getDateDebutVente());
        }
    }
}
