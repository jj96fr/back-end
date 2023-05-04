package Esercizio2;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessun valore inserito!");
        } else {
            int num = Integer.parseInt(args[0]);

            switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                default:
                    System.out.println("Valore inserito non valido!");
                    break;
            }
        }
    }
}
