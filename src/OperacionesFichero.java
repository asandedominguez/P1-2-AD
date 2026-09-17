import java.io.*;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OperacionesFichero {
    public static void main (String[] args) {
        try {
            FileInputStream lectura = new FileInputStream("texto1.txt");
            FileOutputStream copia = new FileOutputStream("texto2.txt");
            int i;
            while ((i = lectura.read()) != -1) {
                copia.write(i);
                System.out.println(i);

            }
        }
        catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }

    }

}
