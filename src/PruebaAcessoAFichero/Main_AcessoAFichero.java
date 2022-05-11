package PruebaAcessoAFichero;

import java.io.FileReader;
import java.io.IOException;

public class Main_AcessoAFichero {

	public static void main(String[] args) throws IOException {
		//Para que funcione correctamente debemos de crear el fichero en una carpeta y donde hayamos puesto para poner el nombre del fichero debemos de escribir la ruta del fichero (incluido el nombre del fichero) de la manera que está abajo
		final String nomFichero="C://Users/Adrián/OneDrive/Documentos/FP Grado Superior/Programación/Apuntes Ficheros/PruebaAcessoAFicheros.txt";
		try (FileReader fichero = new FileReader(nomFichero)){
			int valor = fichero.read();
			while(valor!=-1) {
				
				if(valor!=-32) {
					System.out.print((char) valor);
				}
				valor=fichero.read();
			}
		}catch (IOException e){
			System.out.println("Fichero no existe o ruta incorrecta "+e);
		}
	}

}
