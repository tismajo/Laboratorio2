import java.io.File;
import java.io.File;
import java.io.IOException;

public class Main {
    /**
     * Primer ciclo, Segundo Semestre
     * Programación Orientada a Objetos
     * @author María José Girón Isidro - 23559
     * 
     */
    public static void main(String[] args) throws Exception {
        Vista v = new Vista();
        File enclosuresArchive = new File("EnclosuresCSV.csv");
        File eventsArchive = new File("EventsCSV.csv");

        if (!enclosuresArchive.exists()){
            try {
                enclosuresArchive.createNewFile();
                System.out.println("Archivo de EnclosuresCSV.csv creado");
            } catch (IOException e) {
                System.out.println("Error encontrado" + e.getMessage());
        }

        if (!eventsArchive.exists()){
            try {
                eventsArchive.createNewFile();
                System.out.println("Archivo de EventsCSV.csv creado");
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println("Error encontrado" + e.getMessage());
            }
        }

        v.mostrarMenu();
    }
}
}