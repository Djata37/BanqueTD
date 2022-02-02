package com.cefim.banquetd;

public class Compte {
    private int numero;
    private float solde;

    public Compte(){
        this.numero = numero;
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
        this.retrait(valeur);
        Destinataire.depot(valeur);
    }
}
