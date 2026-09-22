import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OperacionesFichero {
    public static void ejercicio1() {
        try {
            FileInputStream lectura = new FileInputStream("/home/dam26/texto1");
            FileOutputStream copia = new FileOutputStream("texto2");
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("copia compeletada");

            lectura.close();
            copia.close();
        }

        catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }

    public static void ejercicio2() {
        try {
            FileInputStream lectura = new FileInputStream("/home/dam26/texto1");
            FileOutputStream copia = new FileOutputStream("texto2",true);
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("copia compeletada");
        }
        catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }

    public static void main (String[] args) {
        ejercicio1();
        ejercicio2();
    }
}