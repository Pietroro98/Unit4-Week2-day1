package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[5];

        // Riempie l'array con valori casuali tra 1 e 10
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(10);
        }

        while (true) {
            // Stampa l'array corrente
            System.out.print("Array corrente: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Chiede all'utente di inserire il valore e la posizione
            System.out.print("Inserisci il valore (0 per terminare): ");
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }

            System.out.print("Inserisci la posizione (0-4): ");
            int position = scanner.nextInt();

            try {
                array[position] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: Posizione fuori dai limiti dell'array. Riprova.");
            }
        }

        scanner.close();
    }
}
