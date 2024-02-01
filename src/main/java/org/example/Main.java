package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        int storage = 0;
        double zahl1, zahl2;
        double ergebnis = 0;
        char operator;

        System.out.println("Rechnen? [y/n]");
        String input = reader.next();

        while ("y".equals(input)) {
            if (storage == 0) {
                System.out.println("Erste Zahl");
                zahl1 = scan.nextDouble();

                System.out.println("Zweite Zahl");
                zahl2 = scan.nextDouble();

                System.out.println("Operator");
                operator = reader.next().charAt(0);

                ergebnis = switch (operator) {
                    case '+' -> addition(zahl1, zahl2);
                    case '-' -> subtraktion(zahl1, zahl2);
                    case '*' -> multiplikation(zahl1, zahl2);
                    case '/' -> division(zahl1, zahl2);
                    default -> ergebnis;
                };

                storage++;
            } else {
                System.out.println("Operator");
                operator = reader.next().charAt(0);

                System.out.println("Neue Zahl");
                zahl2 = scan.nextDouble();

                ergebnis = switch (operator) {
                    case '+' -> addition(ergebnis, zahl2);
                    case '-' -> subtraktion(ergebnis, zahl2);
                    case '*' -> multiplikation(ergebnis, zahl2);
                    case '/' -> division(ergebnis, zahl2);
                    default -> ergebnis;
                };
            }

            System.out.println("Weiter rechnen? [y/n]");
            input = reader.next();

            if ("n".equals(input)) {
                System.out.println("Das Ergbenis lautet " + ergebnis);
            }
        }
    }

    public static double addition(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }
    public static double subtraktion(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }
    public static double multiplikation(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }
    public static double division(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }
}