package es3;

import java.util.HashMap;

public class Es3 {
    static void main() {
        HashMap<String, Integer> rubrica = new HashMap<>();

    }

    public static void aggiungiContatto(HashMap<String, Integer> lista, String chiave, int valore){
        lista.put(chiave, valore);
    }

    public static void rimuoviContatto(HashMap<String, Integer> lista, String chiave){
        lista.remove(chiave);
    }

    public static void trovaContattoKey (HashMap<String, Integer> lista, String chiave){
        System.out.println(lista.get(chiave));
    }



}
