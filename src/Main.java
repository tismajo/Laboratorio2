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
        v.createVerifyCSVs();
        v.mostrarMenu();
    }
}
