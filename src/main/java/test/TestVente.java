/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.CategVente;
import model.Lieu;
import model.Lot;
import model.Vente;
//import java.time.LocalDate

/**
 *
 * @author sio2
 */
public class TestVente {

    public static void main (String args[]){

        // création d'une instance de Vente nommée v
        Vente v = new Vente();
        v.setId(2);
        v.setNom("Un poneyyyy");
        v.setDateDebutVente(LocalDate.of(2024, 5, 25));

        // création d'une instance de CategVente nommée c
        CategVente c = new CategVente();
        c.setCode(1);
        c.setLibelle("Jument");
        
        // création d'une instance de Lieu nommée l
        Lieu l = new Lieu();
        l.setId(3);
        l.setVille("Cherbourg");
        l.setNbBoxes(5);
        l.setCommentaires("Rawru");
        
        // création d'une instance de Lot nommée l1
        Lot l1 = new Lot();
        l1.setId(1);
        l1.setPrixDepart(15000);
        v.addLot(l1);
        
        //affectation de  la CategVente au Vente grâce à la relation ManyToOne
        v.setCategVente(c);
        v.setLieu(l);

        // Affichage des informations dans la console
        //voir notamment du nom de la catégorie de vente
        System.out.println("Vente : " + " " + v.getNom() + " a vendre, date de debut de la vente prevu le " + v.getDateDebutVente()+ " dans la categorie " + 
                v.getCategVente().getLibelle() + " situee dans la ville de " + v.getLieu().getVille() + " dans le box numero " + v.getLieu().getNbBoxes() + ". " + v.getLieu().getCommentaires());
        
        System.out.println("Liste des lots de la vente : ");
		// Affichage des informations sur lots liées à la vente
        for (Lot lot : v.getLesLots()) {
            System.out.println("Lot numéro : " + lot.getId() + " est de " + lot.getPrixDepart());
        }
    }
}