package es2;

import java.util.*;

public class Es2 {
    static void main() {

        ArrayList<Integer> numCasuali = generaLista(10);
        System.out.println(numCasuali);
        ArrayList<String> elencoParole = new ArrayList<>(Arrays.asList("Casa", "Gioco", "Dado", "Bimbo", "Specchio", "Ruota", "Camino"));
        ArrayList<String> elencoSpecchio = specchio(elencoParole);
        System.out.println(elencoSpecchio);
        pariODispari(elencoParole, true);

    }

    public static ArrayList<Integer> generaLista(int numElementi){
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 0; i <= numElementi; i++) {
            Random rndm = new Random();
            int num = rndm.nextInt(0, 100);
            numeri.add(num);
        }
        Collections.sort(numeri);
        return numeri;
    }

    public static ArrayList<String> specchio(ArrayList<String> lista){
        ArrayList<String> elencoParole = new ArrayList<>();
        elencoParole.addAll(lista);
        for (int i = lista.size() - 1; i >= 0; i--) {
            elencoParole.add(lista.get(i));
        }

        return elencoParole;
    }

    public static void pariODispari (ArrayList<String> lista, boolean pariOdisp){
        if(pariOdisp){
            for (int i = 0; i < lista.size(); i+=2) {
                System.out.println(lista.get(i));
            }
        } else {
            for (int i = 1; i < lista.size(); i+=2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
