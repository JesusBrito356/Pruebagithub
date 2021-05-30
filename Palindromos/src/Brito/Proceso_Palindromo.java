package Brito;

public class Proceso_Palindromo {

	public static boolean palindromo(String suceso1)
	  {
		for( int i = 0; i < suceso1.length(); i++)
		  {
		if(suceso1.charAt(i) != suceso1.charAt(suceso1.length() - i - 1))
		  {
		return false;
		  }
		  }
		return true;
	}	
    }
