package Brito;

import java.io.FileWriter;

        public class Guardado_Palindromo {
	    public static void main(String[] args) {
		String[] lineas = { "OSO" }; 
		String nuevalinea = System.getProperty("line.separator");
		/* FORMA 1 DE ESCRITURA */
		FileWriter archivo = null;
		try {
	    archivo = new FileWriter("Nombres.txt");
	    // Escribimos linea a linea en el archivo
		for (String linea : lineas) {
		archivo.write(linea + nuevalinea);
		}
		} 
		catch (Exception ex) {
		System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
		finally 
		{
	    System.out.println("Archivo guardado!!!");
	    try 
	    {	          
	    if (null != archivo)
	    archivo.close();
	    } 
	    catch (Exception e2) {
	    e2.printStackTrace();
	    }
	    }
	    }
        }


