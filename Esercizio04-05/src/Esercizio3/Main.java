package Esercizio3;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String s = "";
        while (!s.equals(":q")) {
            System.out.print("Inserisci una stringa (inserisci :q per uscire): ");
            s = input.nextLine();

            if (!s.equals(":q")) {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(s.charAt(i));
                    if (i < s.length() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Programma terminato.");
    }
}

