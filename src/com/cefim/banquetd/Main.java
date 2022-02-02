package com.cefim.banquetd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client clients = new Client("Lenny");
        clients.ajouterCompte();

        BanqueInteractive terminal = new BanqueInteractive();

        terminal.interaction();

    }
}
