package com.cefim.banquetd;

import java.util.Scanner;

public class BanqueInteractive {
    Scanner sc = new Scanner(System.in);
    Banque banque = new Banque("BNP", "John Do");

    public void interaction(){
        System.out.println("Quelle opération voulez-vous effectuer ?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une opération sur un client");
        System.out.println("3) Afficher un bilan général");
        if (sc.nextInt() == 1){
            interactionAjoutClient();
        }
        if(sc.nextInt() == 2){
            System.out.println("Quel client ?");
            banque.afficherClients();
            int idClient = sc.nextInt();
            idClient = idClient -1;
            interactionOperationClient(idClient);
        }
        if(sc.nextInt() == 3){
            banque.afficherBilan();
            interaction();
        }
    }

    public void interactionAjoutClient(){
        System.out.println("Entrez le nom du client :");
        banque.ajouterClient(sc.next());
        System.out.println("Le client à bien était ajouté");
        interaction();
    }

    public void interactionOperationClient(int valeur){
        System.out.println("1) Afficher un bilan");
        System.out.println("2) Faire un retrait");
        System.out.println("3) Faire un dépôt");
        System.out.println("4) Faire un virement");
        if(sc.nextInt() == 1) {
            banque.bilanClient(valeur);
            interaction();
        }
        if(sc.nextInt() == 2) {
            System.out.println("Sur quel compte et combien voulez vous retirer ?");
            int numCompte = sc.nextInt();
            float montantDepot = sc.nextFloat();
            banque.retrait(valeur,numCompte, montantDepot);
            System.out.print("Le nouveau solde est ");
            banque.bilanClient(valeur);
            interaction();
        }
        if(sc.nextInt() == 3) {
            System.out.println("Sur quel compte et combien voulez vous déposer ?");
            int numCompte = sc.nextInt();
            float montantDepot = sc.nextFloat();
            if(montantDepot < 0) {
                System.out.println("le montant est négatif");
                return;
            }
            banque.depot(valeur,numCompte, montantDepot);
            System.out.print("Le nouveau solde est ");
            banque.bilanClient(valeur);
            interaction();
        }
        if(sc.nextInt() == 4) {
            System.out.println("Veuillez saisir le compte et combien voulez vous transférer");
            int numCompte = sc.nextInt();
            float montantVirement = sc.nextFloat();
            if(montantVirement < 0) {
                System.out.println("Le montant est négatif");
                return;
            }
            banque.renflouer(valeur, numCompte, montantVirement);
            System.out.print("Le nouveau solde est ");
            banque.bilanClient(valeur);
            interaction();
        }
    }

}
