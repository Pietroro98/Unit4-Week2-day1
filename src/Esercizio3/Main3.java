package Esercizio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente cc = new ContoCorrente("Mario Rossi", 1000);
        ContoOnLine col = new ContoOnLine("Luigi Verdi", 1000, 500);

        try {
            while (true) {
                System.out.print("Scegli il conto (1: ContoCorrente, 2: ContoOnLine, 0: Esci): ");
                int scelta = scanner.nextInt();

                if (scelta == 0) {
                    break;
                }

                System.out.print("Inserisci l'importo da prelevare: ");
                double importo = scanner.nextDouble();

                try {
                    if (scelta == 1) {
                        cc.preleva(importo);
                        System.out.println("Nuovo saldo ContoCorrente: " + cc.restituisciSaldo());
                    } else if (scelta == 2) {
                        col.preleva(importo);
                        System.out.println("Nuovo saldo ContoOnLine: " + col.restituisciSaldo());
                    }
                } catch (BancaException e) {
                    System.out.println(e.getMessage());
                }
            }
        } finally {
            scanner.close();
        }
    }
}
