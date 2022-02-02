package com.cefim.banquetd;

public class Compte {
    private int numéro;
    private float solde;

    public Compte(){
        this.numéro = numéro;
        this.solde = solde;
    }

    public void depot(float valeur){
        this.solde = solde + valeur;
    }

    public void retrait(float valeur){
        this.solde = solde - valeur;
    }

    public float getSolde(){
        return this.solde;
    }

    public void afficherSolde(){
        System.out.println(this.solde);
    }

    public void virer(float valeur, Compte Destinataire){
    }
}
