package Pokemon;

import java.util.ArrayList;

public class Usuari {
	
	String alias;
	
	ArrayList <Pokemon> equip;
	
	
	public Usuari(String alias){
		
		this.alias = alias;
		
		equip.ensureCapacity(6);
		
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	} 

	
	
}
