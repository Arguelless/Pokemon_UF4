package Pokemon;

public class Agua extends Pokemon{

	final int danyBaseA = 15;
	
	final int defensa = 10;
	
	final int precisio = 80;
	
	
	
	public Agua(String nom, int vida) {
		
		
		
		super.setDefensa(vida);
		super.setNom(nom);
		super.setPrecisio(vida);
		super.setVida(vida);
		
		
		
		
	}



	@Override
	public String toString() {
		return "Tipo: Agua \nNom: " + super.getNom() + 
				"\n-Daño base : " + danyBaseA + 
				"\nVida: "+ getVida() + 
				"\nDefensa: " + getDefensa() + 
				"\nPrecisio: "+ getPrecisio() + 
				"\nEnergia: " + getEnergia() + "\n";
	}



	@Override
	public void resetStats() {
		
			
			super.setEnergia(energy);
			
			super.setVida(rn.nextInt(450 - 250 +1) - 250); 
			
			
	
	}

	
	
	
}
	

