package Esercizio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i km percorsi: ");
            double km = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Divisione per zero");
            }

            double kmPerLitro = km / litri;
            System.out.println("Km/litro percorsi: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Non si può dividere per zero.");
        } finally {
            scanner.close();
        }
    }
}
