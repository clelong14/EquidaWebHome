/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Lot {
    private int id;
    private int prixDepart;
    
    private Vente vente;
    
    public Lot() {
    }

    public Lot(int id) {
        this.id = id;
    }

    public Lot(int id, int prixDepart) {
        this.id = id;
        this.prixDepart = prixDepart;
    }

    public Lot(int id, int prixDepart, Vente vente) {
        this.id = id;
        this.prixDepart = prixDepart;
        this.vente = vente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }
}
