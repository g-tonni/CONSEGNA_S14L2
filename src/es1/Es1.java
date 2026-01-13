package es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli il numero di elementi: ");
        int num = Integer.parseInt(scanner.nextLine());

        ArrayList<String> elencoParole = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Scrivi una parola: ");
            String parola = scanner.nextLine();
            elencoParole.add(parola);
        }

        System.out.println("Elenco parole scelte: " + elencoParole);

        ArrayList<String> duplicati = new ArrayList<>();
        Set<String> nonDuplicati = new HashSet<>();

        for (int i = 0; i < elencoParole.size(); i++) {
            if(nonDuplicati.add(elencoParole.get(i)) == false) {
                duplicati.add(elencoParole.get(i));
            } else {
                nonDuplicati.add(elencoParole.get(i));
            }
        }

        System.out.println("Elementi duplicati: " + duplicati);
        System.out.println("Numero elementi non duplicati: " + nonDuplicati.size());
        System.out.println("Elenco non duplicati: " + nonDuplicati);
    }
}
