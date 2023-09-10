import java.util.Scanner;

public class Vista {
    Controlador c = new Controlador();
    Scanner scn = new Scanner(System.in);

    public void createVerifyCSVs(){
        c.creationVerificationCSV();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nM E N Ú");
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Ingresar datos\n2. Consultar un recinto\n3. Consultar un evento\n4. Eventos sin recinto\n5. Asignar un evento a un recinto");
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
                    int answ;
                    System.out.println("¿Por medio de qué quieres consultar el recinto? \n 1. ID del país\n 2. ID del recinto\n 3. Ubicación\n 4. Salir del programa");
                    answ = scn.nextInt();
                    scn = new Scanner(System.in);
                    switch (answ) {
                        case 1:
                        System.out.print("Ingresa el ID del país: ");
                        String countryID = scn.nextLine();
                        c.consultEnclosuresCountryID(countryID);
                        break;

                        case 2:
                        System.out.print("Ingresa el ID del recinto (0 si aún no está asignado): ");
                        String enclosureID = scn.nextLine();
                        c.consultEnclosureID(enclosureID);
                        break;

                        case 3:
                        System.out.print("Ingresa la ubicación: ");
                        String eventLocation = scn.nextLine();
                        c.consultEnclosureeventLocation(eventLocation);
                        break;

                        default:
                        System.out.println("Inténtelo de nuevo");
                        break;
                    }
                    break;
                case 3:
                scn = new Scanner(System.in);
                System.out.print("Ingresa el ID del evento: ");
                    String eventID = scn.nextLine();
                    c.consultEventID(eventID);
                    break;
                case 4:
                    c.eventWOenclosure();
                case 5:
                scn = new Scanner(System.in);
                System.out.println("Ingrese el ID del evento");
                String eventID2 = scn.nextLine();
                System.out.println("Ingrese el ID del recinto");
                String enclosureID2 = scn.nextLine();
                c.assignEventEnclosure(eventID2, enclosureID2); 
                break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida 😊.");
                    break;
            }
        }
}
}