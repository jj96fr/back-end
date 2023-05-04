package Esercizio4;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Inserisci un numero intero: ");

        int num = 0;
        int ch;
        while ((ch = System.in.read()) != '\n') {
            num = num * 10 + ch - '0';
        }

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
