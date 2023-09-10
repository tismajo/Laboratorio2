import java.util.Scanner;

public class Vista {
    Controlador c = new Controlador();
    Scanner scn = new Scanner(System.in);

    public void createVerifyCSVs(){
        c.creationVerificationCSV();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("M E N Ú");
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Ingresar datos");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                int q1;
                System.out.println("¿Quiere ingresar datos para un recinto o un evento? (Escriba 1 para recinto y 2 para evento.)");
                q1 = scn.nextInt();
                if (q1 == 1){
                    c.addEnclosureInformation();
                } else if (q1 == 2){
                    c.addEventInformation();
                }
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

    public void requestAddInfo(){

    }

}