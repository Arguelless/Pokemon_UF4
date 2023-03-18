package Pokemon;

import java.util.Random;
import java.util.Scanner;

public class MainPruebas {
	
	static Scanner lector = new Scanner(System.in);
	
	 public static void main(String[] args) {
		
		 
	while(Datos.salir == true) {
		
		while (Datos.flg_0 == true) {
			
			Funciones.printTitle();
			
			lector.next();
			lector.nextLine();
			
			Datos.flg_newUser = true;
			Datos.flg_0 = false;
			
			
		}
		
		
		while (Datos.flg_newUser == true) {
			
			
			Funciones.newUser();
			
			
		}
		
		
		
		
	}
		 
		 
		
	}
	
	
	
	
	

}
