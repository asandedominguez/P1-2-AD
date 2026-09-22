import java.io.*;

public class OperacionesData {
    public static void ejercicio7(String ruta, String cadena) {
        try {
            File fichero = new File(ruta);
            int n = 0;
            while (n < 3) {
                n++;

                DataOutputStream escritura = new DataOutputStream(new FileOutputStream(fichero, true));
                escritura.writeUTF(cadena);
                escritura.close();

                System.out.println("escribindo a cadea: " + cadena);
                System.out.println("tamaño do ficheiro: " + fichero.length() + " bytes");
            }
        } catch (IOException e) {
            System.out.println("No se encontró el fichero");
        }
    }

    public static void ejercicio8(String ruta) {
        try {
            File fichero = new File(ruta);
            DataInputStream lectura = new DataInputStream(new FileInputStream(fichero));

            System.out.println("tamaño final do ficheiro: " + lectura.available() + " bytes");

            while (lectura.available() > 0) {
                System.out.println("quedan: " + lectura.available() + " bytes por ler");
                String cadena = lectura.readUTF();
                System.out.println("cadea: " + cadena);
            }

            System.out.println("Xa non queda nada por ler");
            lectura.close();

        } catch (IOException e) {
            System.out.println("No se encontró el fichero");
        }
    }
    public static void main (String[] args) {
        String ruta = "/home/dam26/texto3.txt";
        String cadena = "o tempo está xélido";

        ejercicio7(ruta, cadena);
        ejercicio8(ruta);
    }
}