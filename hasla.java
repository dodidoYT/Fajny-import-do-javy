package fajnyimport;

import java.util.*;

public class hasla {
    public static String haslo;
    public static void ustawHaslo(String h) {
        haslo = h;
    }
    public static void zapytajOhaslo() {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj haslo...");

        if (skaner.nextLine().equals(haslo)) {
            System.out.println("Dobra haslo. Wpuszczam...");
        } else {
            System.err.println("Zle haslo! Blokuję...");
        }
    }
}