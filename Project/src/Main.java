import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEstas en el menu\nSelecciona una opción:");
            System.out.println("1. PR430Main.java");
            System.out.println("2. PR431Main.java");
            System.out.println("0. Salir");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    PR430Main.main(args);
                    // Agrega aquí el código para la Opción 1
                    break;
                case 2:
                    PR431Main.main(args);
                    // Agrega aquí el código para la Opción 2
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }
}
