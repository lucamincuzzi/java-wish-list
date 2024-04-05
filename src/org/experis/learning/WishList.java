package org.experis.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        ArrayList<Regalo> listaRegali = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ciclo per chiedere all'utente di inserire i regali
        boolean continua = true;
        while (continua) {
            System.out.print("Inserisci il nome del regalo: ");
            String nomeRegalo = scanner.nextLine();
            listaRegali.add(new Regalo(nomeRegalo));

            System.out.println("Lunghezza della lista dei regali: " + listaRegali.size());
            System.out.print("Vuoi inserire un altro regalo? (s/n): ");
            String risposta = scanner.nextLine();
            continua = risposta.equalsIgnoreCase("s");
        }

        // Ordinamento della lista
        Collections.sort(listaRegali);

        // Stampa della lista ordinata
        System.out.println("Lista dei regali ordinata:");
        int counter = 0;
        for (Regalo r : listaRegali) {
            counter++;
            String strCounter = counter + "° ";
            System.out.print(strCounter);
            System.out.println(r);
        }

        scanner.close();
    }
}
