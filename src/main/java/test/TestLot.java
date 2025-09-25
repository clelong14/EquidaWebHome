/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.Lot;
import model.Vente;

/**
 *
 * @author sio2
 */

public class TestLot {
    
    public static void main (String args[]){

        // création d'une instance de Lot nommée l
        Lot l = new Lot();
        l.setId(1);
        l.setPrixDepart(50000);

        // création d'une instance de vente nommée v
        Vente v = new Vente();
        v.setId(2);
        v.setNom("Jument");
        v.setDateDebutVente(LocalDate.of(2024, 5, 25));

        //affectation de la vente au lot grâce à la relation ManyToOne
        l.setVente(v);

        // Affichage des informations dans la console
        //voir notamment du lot de la vente
        System.out.println("Lot : " + l.getId() + " " + l.getPrixDepart() + " "
                + " " + v.getNom());
    }
    
}