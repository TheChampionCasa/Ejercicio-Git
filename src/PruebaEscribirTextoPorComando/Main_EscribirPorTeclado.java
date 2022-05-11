package PruebaEscribirTextoPorComando;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main_EscribirPorTeclado {
	
	public static void main(String[] args) {
		//El JOptionPane es como el prompt en javascript, lo que hace es en lugar de tener que escribirlo por consola, lo escribes por una ventana que se abre
        String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero");
        String texto = JOptionPane.showInputDialog("Introduce el texto que quieres escribir en el fichero");
        escribirFichero(ruta, texto);
        mostrarFichero(ruta);
    }
    public static void escribirFichero(String nomFich, String texto) {
        try (FileWriter fich = new FileWriter(nomFich);) {
            // Escribimos el texto en el fichero
            fich.write(texto);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + e);
        }
    }
    public static void mostrarFichero(String nomFich) {
        System.out.println("El contenido de: " + nomFich + " es: ");
        // Leemos texto del fichero
        try (FileReader fr = new FileReader(nomFich)) {
            int caracter = fr.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Problema con la lectura/escritura en el fichero " + e);
        }
    }
}
