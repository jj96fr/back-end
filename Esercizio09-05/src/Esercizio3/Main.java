package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Selezionare l'operazione desiderata:");
            System.out.println("1. Inserisci contatto");
            System.out.println("2. Cancella contatto");
            System.out.println("3. Cerca contatto per numero di telefono");
            System.out.println("4. Cerca contatto per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("0. Esci");

            int scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci nome del contatto:");
                    String nome = input.nextLine();
                    System.out.println("Inserisci numero di telefono:");
                    String telefono = input.nextLine();
                    rubrica.inserisciContatto(nome, telefono);
                    break;
                case 2:
                    System.out.println("Inserisci nome del contatto da cancellare:");
                    String nomeCancellare = input.nextLine();
                    rubrica.cancellaContatto(nomeCancellare);
                    break;
                case 3:
                    System.out.println("Inserisci numero di telefono da cercare:");
                    String telefonoCercare = input.nextLine();
                    String nomeCercato = rubrica.cercaNome(telefonoCercare);
                    if (nomeCercato != null) {
                        System.out.println("Il nome corrispondente al numero di telefono " + telefonoCercare + " è " + nomeCercato);
                    } else {
                        System.out.println("Nessun contatto trovato con il numero di telefono " + telefonoCercare);
                    }
                    break;
                case 4:
                    System.out.println("Inserisci nome da cercare:");
                    String nomeCercare = input.nextLine();
                    String telefonoCercato = rubrica.cercaTelefono(nomeCercare);
                    if (telefonoCercato != null) {
                        System.out.println("Il numero di telefono corrispondente a " + nomeCercare + " è " + telefonoCercato);
                    } else {
                        System.out.println("Nessun contatto trovato con il nome " + nomeCercare);
                    }
                    break;
                case 5:
                    rubrica.stampaContatti();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida");
            }

            System.out.println();
        }
    }
}
