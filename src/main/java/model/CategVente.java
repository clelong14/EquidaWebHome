/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class CategVente {
    private int code;
    private String libelle;
    
    private ArrayList<Vente> lesVentes ;
    

    public CategVente() {
    }

    public CategVente(int code) {
        this.code = code;
    }

    public CategVente(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public CategVente(int code, String libelle, ArrayList<Vente> lesVentes) {
        this.code = code;
        this.libelle = libelle;
        this.lesVentes = lesVentes;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Vente> getLesVentes() {
        return lesVentes;
    }

    public void setLesVentes(ArrayList<Vente> lesVentes) {
        this.lesVentes = lesVentes;
    }
    
    public void addVente(Vente uneVente){
        if (lesVentes ==null ){
            lesVentes = new ArrayList<Vente>();
        }
        lesVentes.add(uneVente);
    }
}