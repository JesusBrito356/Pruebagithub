package Brito;
import java.io.*;
public class Lectura_De_Archivo {
public String lectura(String Direccion){
		String texto = "";
		try {
		BufferedReader  buffer = new BufferedReader(new FileReader(Direccion));
		String temp = "";
		String bufferRead;
		while((bufferRead = buffer.readLine()) != null){	
		temp = temp + bufferRead;
		}
         texto = temp;	
		}catch(Exception e) {System.err.print("No Se Encontro Ningun Archivo");}
		return texto;
}
}
