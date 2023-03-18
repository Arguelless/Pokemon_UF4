package Pokemon;

import java.lang.Thread;

import java.util.Scanner;

public class Funciones {
	
	
	
	static Scanner lector_f = new Scanner(System.in);
	
	//Imprime el titulo inicial y el "Enter for play."
	
	public static void printTitle() {
		
		
		 for (String x : Datos.pokeTitle) {
			  
			  System.out.println(x);
			  
			  
		  }
		 

		 	
	}
	
	
	
	public static void newUser() {
		
		
		while (Datos.flg_UserNameOk == false) {
			
			
			
		
			System.out.println("                     -INTRODUZCA SU NOMBRE DE USUARIO -");
			String nombreUser = lector_f.next();
			lector_f.nextLine();
			Usuari x = new Usuari();
			Datos.flg_UserNameOk = x.usuari(nombreUser, "Humano");
			System.out.println("Usuario creado con exito. \n");
			System.out.println(x.toString());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
