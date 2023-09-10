import java.util.Scanner;

public class Vista {
    Controlador c = new Controlador();
    Scanner scn = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("M E N Ú");
            System.out.println("Ingresa el número de opción: ");
            System.out.println("[Insertar las opciones que tiene el usuario]");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida 😊.");
                    break;
            }
        }
}
}