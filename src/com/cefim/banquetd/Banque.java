package com.cefim.banquetd;

import java.util.Arrays;

public class Banque {
    private String nom;
    private Client[] clients = new Client[1];

    public Banque(String nomBanque, String nomClient){
        this.nom = nomBanque;
        this.clients[0] = new Client(nomClient);
    }

    public Client ajouterClient(String valeur){
        this.clients = Arrays.copyOf(clients, (clients.length + 1));
        return this.clients[clients.length - 1] = new Client(valeur);
    }

    public void bilanClient(int valeur){
        this.clients[valeur].afficherSolde();
    }

    public void afficherBilan(){
        for(Client client : clients){
            client.getNom();
            client.afficherSolde();
        }
    }

    public void afficherClients(){
        for(int i = 0; i < clients.length; i++){
            System.out.print((i + 1) + ") ");
            clients[i].getNom();
        }
    }

    public void depot(int valeur,int compte, float montant){
        this.clients[valeur].depot(compte, montant);
    }

    public void retrait(int valeur,int compte, float montant){
        this.clients[valeur].retrait(compte, montant);
    }

    public void renflouer(int valeur,int compte, float montant){
        this.clients[valeur].renflouer(compte, montant);
    }
}
