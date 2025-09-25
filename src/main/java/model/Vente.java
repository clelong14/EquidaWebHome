/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Vente {
    
    private int id;
    private String nom;
    private LocalDate dateDebutVente;
    
    private CategVente categVente;
    private Lieu lieu;
    
    private ArrayList<Lot> lesLots;

    public Vente() {
        
    }

    public Vente(int id) {
        this.id = id;
    }

    public Vente(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Vente(int id, String nom, LocalDate dateDebutVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
    }

    public Vente(int id, String nom, LocalDate dateDebutVente, CategVente categVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.categVente = categVente;
    }

    public Vente(int id, String nom, LocalDate dateDebutVente, CategVente categVente, Lieu lieu) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.categVente = categVente;
        this.lieu = lieu;
    }

    public Vente(int id, String nom, LocalDate dateDebutVente, CategVente categVente, Lieu lieu, ArrayList<Lot> lesLots) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.categVente = categVente;
        this.lieu = lieu;
        this.lesLots = lesLots;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDebutVente() {
        return dateDebutVente;
    }

    public void setDateDebutVente(LocalDate dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getCategVente() {
        return categVente;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public ArrayList<Lot> getLesLots() {
        return lesLots;
    }

    public void setLesLots(ArrayList<Lot> lesLots) {
        this.lesLots = lesLots;
    }
    
    public void addLot(Lot unLot){
        if (lesLots == null) {
        lesLots = new ArrayList<>();
            }
        lesLots.add(unLot);
    }
    
    @Override
    public String toString() {
        return id + " à comme nom " + nom;
    }
}