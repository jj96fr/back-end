package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10; 

        List<Integer> lista = generaListaCasuale(n);
        System.out.println("Lista generata casualmente: " + lista);

        List<Integer> listaPari = filtraPari(lista);
        System.out.println("Lista dei valori pari: " + listaPari);

        List<Integer> listaDispari = filtraDispari(lista);
        System.out.println("Lista dei valori dispari: " + listaDispari);
    }

    public static List<Integer> generaListaCasuale(int n) {
        List<Integer> lista = new ArrayList<>(n);
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101)); 
        }

        return lista;
    }

    public static List<Integer> filtraPari(List<Integer> lista) {
        List<Integer> listaPari = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) { 
                listaPari.add(lista.get(i));
            }
        }

        return listaPari;
    }

    public static List<Integer> filtraDispari(List<Integer> lista) {
        List<Integer> listaDispari = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 1) { 
                listaDispari.add(lista.get(i));
            }
        }

        return listaDispari;
    }
}
