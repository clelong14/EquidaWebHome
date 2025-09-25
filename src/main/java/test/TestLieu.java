/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.Lieu;
import model.Lot;
import model.Vente;

/**
 *
 * @author sio2
 */
public class TestLieu {
    public static void main (String args[]){
        // instantiation d'une race
        Lieu l = new Lieu();
        l.setId(1);
        l.setVille("Cherbourg");

        // instanciation de 2 vente v1 et v2
        // ajout des ventes v1 et v2 à l'arraylist des ventes grâce
        // à la relation OneToMany
        Vente v1 = new Vente();
        v1.setId(1);
        v1.setNom("Un poney qui va vite");
        v1.setDateDebutVente(LocalDate.of(2023, 12, 13));
        l.addVente(v1);

        Vente v2 = new Vente();
        v2.setId(7);
        v2.setNom("Un cheval de course incroyaaaable");
        v2.setDateDebutVente(LocalDate.of(2024, 10, 17));
        l.addVente(v2);

        //Affichage des informations de la race
        System.out.println("Le lieu est " + l.getId() + " " + l.getVille() + " et contient " + l.getLesVentes().size() + " ventes." );
        System.out.println("Liste des vente de la ville de " + l.getVille() + " : ");
		// Affichage des informations sur chevaux liées à la race
        for (Vente v : l.getLesVentes()){
            System.out.println("Vente : " + v.getId() + " " + v.getNom() + " " + v.getDateDebutVente());
        }
    }
    
}
