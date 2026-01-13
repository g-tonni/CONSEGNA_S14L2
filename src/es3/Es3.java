package es3;

import java.util.HashMap;

public class Es3 {
    static void main() {
        HashMap<String, Integer> rubrica = new HashMap<>();
        rubrica.put("Giada", 333333333);
        rubrica.put("Mario", 222222222);
        rubrica.put("Luca", 444444444);
        rubrica.put("Franco", 55555555);

        aggiungiContatto(rubrica,"Maria", 22224542);
        stampa(rubrica);

        rimuoviContatto(rubrica, "Mario");
        stampa(rubrica);

        trovaContattoKey(rubrica, "Giada");

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

    public static void stampa (HashMap<String, Integer> lista){
        System.out.println(lista);
    }


}
