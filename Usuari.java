package Pokemon;

import java.util.ArrayList;

public class Usuari {
	
	private String alias;
	
	private ArrayList <Pokemon> equip;
	
	private String type;
	
	
	public boolean usuari(String alias, String type){
		
		
		
			
		this.type = type;
			
			
		
		
		if (alias.equals(" ") || alias.equals("") ){
			
			System.out.println("El nombre de usuario no puede estar vacio, ingreselo de nuevo.");
			
			return false;
			
		}
		
		this.alias = alias;
		equip = new ArrayList<Pokemon>();
		equip.ensureCapacity(6);
		
		return true;
		
	}

	@Override
	public String toString() {
		return "Usuari [alias=" + alias + ", equip=" + equip + ", type=" + type + "]";
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	} 

	
	
}
