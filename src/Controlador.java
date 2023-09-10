import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;


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

            int enclosureID;
            do{
                System.out.print("Ingresa el ID del recinto (Del 1 al 99, escriba 0 si no tiene recinto): ");
                enclosureID = scn.nextInt();
                if (enclosureID < 0 || enclosureID > 99) {
                    System.out.println("El número está fuera del rango.");
                }
            } while (enclosureID < 0 || enclosureID > 99);

            int enclosureCapacity;
            do{
            System.out.print("Ingresa la capacidad del recinto (entre 10 y 150000): ");
                enclosureCapacity = scn.nextInt();
                if (enclosureID < 10 || enclosureID > 150000) {
                    System.out.println("El número está fuera del rango.");
                }
            } while (enclosureID < 10 || enclosureID > 150000);

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
        
            int eventTimeTable;
            do{
                System.out.print("Ingrese el horario (De 6 a 22): ");
                eventTimeTable = scn.nextInt();
                if (eventTimeTable < 6 || eventTimeTable > 22) {
                    System.out.println("El número está fuera del rango.");
                }
            } while (eventTimeTable < 6 || eventTimeTable > 22);
            scn.nextLine(); // Limpia el salto de línea pendiente
        
            System.out.print("Ingrese la fecha: ");
            String eventDateStr = scn.nextLine();
        
            int eventDuration;
            do{
                System.out.print("Ingrese la duración (Entre 1 hora y 12 horas): ");
                eventDuration = scn.nextInt();
                if (eventDuration < 1 || eventDuration > 12) {
                    System.out.println("El número está fuera del rango.");
                }
            } while (eventTimeTable < 6 || eventTimeTable > 22);
        
            int eventAttendeesNumber;
            do{
                System.out.print("Ingrese la cantidad de asistentes (De 10 a 15000): ");
                eventAttendeesNumber = scn.nextInt();
                
                if (eventAttendeesNumber < 10 || eventAttendeesNumber > 15000) {
                    System.out.println("El número está fuera del rango.");
                }
            } while (eventAttendeesNumber < 10 || eventAttendeesNumber > 15000);

            writer.write(eventID + "," + countryID + "," + artistName + "," + eventTimeTable + "," +
            eventDateStr + "," + eventDuration + "," + eventAttendeesNumber);
            writer.newLine();
        
            System.out.println("Datos agregados al archivo CSV exitosamente.");
        
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }
    
    public void consultEnclosuresCountryID(String countryID){
        String csvArchive = "enclosuresCSV.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvArchive))) {
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 1 && datos[0].equals(countryID)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void consultEnclosureID(String enclosureID){
        String csvArchive = "enclosuresCSV.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvArchive))) {
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 3 && datos[2].equals(enclosureID)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void consultEnclosureeventLocation(String enclosureLocation){
        String csvArchive = "enclosuresCSV.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvArchive))) {
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 2 && datos[1].equals(enclosureLocation)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void consultEventID(String eventID){
        String csvArchive = "eventsCSV.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvArchive))) {
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length >= 2 && datos[1].equals(eventID)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void eventWOenclosure(){
        String archivoCSV = "enclosuresCSV.csv";
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 3 && datos[2].equals("0")) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void assignEventEnclosure(String eventID2, String enclosureID2){
        // Rutas de los archivos CSV
        String rutaArchivo1 = "eventsCSV.csv";
        String rutaArchivo2 = "enclosuresCSV.csv";
        String rutaArchivo3 = "archivo3.csv";

        try {
            // Leer archivo 1 y buscar dato en la segunda columna
            BufferedReader reader1 = new BufferedReader(new FileReader(rutaArchivo1));
            String lineaArchivo1;
            String filaEncontradaArchivo1 = null;
            while ((lineaArchivo1 = reader1.readLine()) != null) {
                String[] datos = lineaArchivo1.split(",");
                if (datos.length >= 2 && datos[1].equals(eventID2)) {
                    filaEncontradaArchivo1 = lineaArchivo1;
                    break;
                }
            }
            reader1.close();

            // Leer archivo 2 y buscar dato en la tercera columna
            BufferedReader reader2 = new BufferedReader(new FileReader(rutaArchivo2));
            String lineaArchivo2;
            String filaEncontradaArchivo2 = null;
            while ((lineaArchivo2 = reader2.readLine()) != null) {
                String[] datos = lineaArchivo2.split(",");
                if (datos.length >= 3 && datos[2].equals(enclosureID2)) {
                    filaEncontradaArchivo2 = lineaArchivo2;
                    break;
                }
            }
            reader2.close();

            // Escribir la fila encontrada en el archivo 3
            if (filaEncontradaArchivo1 != null && filaEncontradaArchivo2 != null) {
                FileWriter writer3 = new FileWriter(rutaArchivo3);
                writer3.write(filaEncontradaArchivo1 + "," + filaEncontradaArchivo2);
                writer3.close();
                System.out.println("La información se ha guardado en el archivo 3.");
            } else {
                System.out.println("No se encontró la información en los archivos.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}