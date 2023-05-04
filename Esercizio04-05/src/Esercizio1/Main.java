package Esercizio1;

public class Main {
    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String stringa1 = "ciao";
        String stringa2 = "hello";
        int anno1 = 2000;
        int anno2 = 2023;

        System.out.println("La stringa " + stringa1 + " ha lunghezza pari? " + stringaPariDispari(stringa1));
        System.out.println("La stringa " + stringa2 + " ha lunghezza pari? " + stringaPariDispari(stringa2));

        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
    }
}
