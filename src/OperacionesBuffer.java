import java.io.*;

public class OperacionesBuffer {
    public static void ejercicio5() {
        try {
            BufferedInputStream lectura = new BufferedInputStream(new FileInputStream("/home/dam26/IMAGEN.jpg"));
            BufferedOutputStream copia = new BufferedOutputStream(new FileOutputStream("/home/dam26/IMAGEN2-AD.jpg"));
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("reemplazada compeletada");

        } catch (IOException e) {
            System.out.println("No se encontró la imagen");
        }
    }
    public static void ejercicio6() {
        try {
            BufferedInputStream lectura = new BufferedInputStream(new FileInputStream("/home/dam26/IMAGEN.jpg"));
            BufferedOutputStream copia = new BufferedOutputStream(new FileOutputStream("/home/dam26/IMAGEN3.jpg", true));
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
            }
            System.out.println("reemplazada compeletada");

        } catch (IOException e) {
            System.out.println("No se encontró la imagen");
        }
    }

    public static void main (String[] args) {
        ejercicio5();
        ejercicio6();
    }
}
