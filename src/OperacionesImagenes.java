import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OperacionesImagenes {
    public static void ejercicio3() {
        try {
            FileInputStream lectura = new FileInputStream("/home/dam26/IMAGEN.jpg");
            FileOutputStream copia = new FileOutputStream("/home/dam26/IMAGEN2-AD.jpg");
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("reemplazada compeletada");

        } catch (IOException e) {
            System.out.println("No se encontró la imagen");
        }
    }

    public static void ejercicio4() {
        try {
            FileInputStream lectura = new FileInputStream("/home/dam26/IMAGEN.jpg");
            FileOutputStream copia = new FileOutputStream("/home/dam26/IMAGEN3.jpg", true);
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("reemplazada entera compeletada");

        } catch (IOException e) {
            System.out.println("No se encontró la imagen");
        }
    }
    public static void main (String[] args) {
        ejercicio3();
        ejercicio4();
    }
}

