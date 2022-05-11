package PruebaPrintWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main_PrintWriter {
	
	public static void main(String[] args) throws IOException {
		ejemploEscribeFichTexto(null, 0, 0, "Error");
	}
		
	public static void ejemploEscribeFichTexto(String nomFich,
				int i, double x, String str) throws IOException {
				PrintWriter fichero = null;
				 try {
					 // Abre el fichero
					fichero= new PrintWriter(new FileWriter(nomFich));
					 // escribe los datos en el fichero
					System.out.println("Entero: " + i + " Real: " + x);
					System.out.println("String: " + str);
				 } finally {
					 if (fichero != null)
					System.out.close(); // Cierra el fichero
				 }
	}
}