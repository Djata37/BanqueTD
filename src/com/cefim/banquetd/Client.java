package com.cefim.banquetd;

import java.util.Arrays;

public class Client{
    private String nom;
    private Compte[] comptes = new Compte[1];
    private int nbComptes;

    public Client(String nomDuClient){
        this.nom = nomDuClient;
        this.comptes[0] = new Compte();
        this.comptes[0].depot(0);
    }

    public void getNom(){
        System.out.println(this.nom);
    }

    public float getSolde(){
        float soldes = 0;
        for ( int i = 0; i < nbComptes; i++) {
            soldes += comptes[i].getSolde();
        }
        return soldes;
    }

    public void afficherSolde(){
        float soldes = 0;
        nbComptes = this.comptes.length;
        for( int i = 0; i < nbComptes; i++) {
            soldes += comptes[i].getSolde();
        }
        System.out.println(soldes);
    }

     public Compte ajouterCompte(){
        nbComptes = this.comptes.length;
        if (nbComptes < 100) {
            this.comptes = Arrays.copyOf(comptes, (comptes.length + 1));
            return this.comptes[comptes.length - 1] = new Compte();
        }
        else return null;
     }

    public void depot(int valeur, float montant){
        this.comptes[valeur].depot(montant);
    }

    public void retrait(int valeur, float montant){
        this.comptes[valeur].retrait(montant);
    }

    public void renflouer(int valeur, float montant){
        this.comptes[valeur].retrait(montant);
        this.comptes[0].depot(montant);
    }

}