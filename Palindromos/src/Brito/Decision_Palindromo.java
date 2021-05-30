package Brito;

import java.io.*;
public class Decision_Palindromo {

	public static void main(String[] args) {
        
		 Lectura_De_Archivo tecla = new Lectura_De_Archivo();
	        String suceso1 = tecla.lectura("C:\\Users\\jaser\\OneDrive\\Escritorio\\PRO_2\\Palindromos//Nombres.txt"); //AQUI USE LA DIRECCION EN DONDE GUARDO MI ARCHIVO PALINDROMO
	        System.out.println(suceso1);
	        
	        Proceso_Palindromo Pal = new Proceso_Palindromo();
	        boolean pay = false;
	        pay = Pal.palindromo(suceso1);
	        if (pay == true) {
	        	//decision al saber si la palabra es palindromo o si no es
	        System.out.print("ES PALINDROMO");
	        System.out.print("(Recomendacion: en caso de usar otra palabra palindromo puede utilizar ejemplos como; otto, ana, etc) ");
	    }
	        else {
	        	 System.out.print("NO ES PALINDROMO");
	        	 System.out.print("(Recomendacion: en caso de usar otra palabra palindromo puede utilizar ejemplos como; otto, ana, etc) ");
	        	 
	        	 
	        	
}
}
}   