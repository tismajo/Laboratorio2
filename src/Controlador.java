import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Controlador {
    public void creationVerificationCSV(){
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
    }
}

    public void addEnclosureInformation(){
        String archivename = "enclosuresCSV.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivename, true))) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingresa los datos solicitados para llenar el archivo de los recintos");
            System.out.print("Ingrese el ID del país: ");
            String countryID = scn.nextLine();

            System.out.print("Ingresa la ubicación del evento: ");
            String location = scn.nextLine();

            System.out.print("Ingresa el ID del recinto: ");
            String enclosureID = scn.nextLine();

            System.out.print("Ingresa la capacidad del recinto: ");
            int enclosureCapacity = scn.nextInt();

            writer.write(countryID + "," + location + "," + enclosureID + "," + enclosureCapacity);
            writer.newLine();

            System.out.println("Datos agregados al archivo CSV exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public void addEventInformation(){
        String archivename = "eventsCSV.csv";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivename, true))) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingresa los datos solicitados para llenar el evento a agregar");
            System.out.print("Ingrese el ID del evento: ");
            int eventID = scn.nextInt();
        
            System.out.print("Ingrese el ID del país: ");
            int countryID = scn.nextInt();
            scn.nextLine(); // Limpia el salto de línea pendiente
        
            System.out.print("Ingrese el nombre del artista: ");
            String artistName = scn.nextLine();
        
            System.out.print("Ingrese el horario: ");
            int eventTimeTable = scn.nextInt();
        
            scn.nextLine(); // Limpia el salto de línea pendiente
        
            System.out.print("Ingrese la fecha: ");
            String eventDateStr = scn.nextLine();
            // Aquí puedes convertir la cadena eventDateStr a un tipo de dato adecuado (por ejemplo, Date o LocalDate) si es necesario.
        
            System.out.print("Ingrese la duración: ");
            int eventDuration = scn.nextInt();
        
            System.out.print("Ingrese la cantidad de asistentes: ");
            int eventAttendeesNumber = scn.nextInt();
        
            // Escribir los datos en una nueva línea en el archivo CSV
            writer.write(eventID + "," + countryID + "," + artistName + "," + eventTimeTable + "," +
            eventDateStr + "," + eventDuration + "," + eventAttendeesNumber);
            writer.newLine(); // Agregar una nueva línea
        
            System.out.println("Datos agregados al archivo CSV exitosamente.");
        
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }
    
    
}