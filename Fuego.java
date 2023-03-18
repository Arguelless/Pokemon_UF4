package Pokemon;

public class Fuego extends Pokemon {

	

	
	final private int danyBaseF = 15;
	
	final private int defensaF = 10;
	
	final private int precisioF = 80;
	




		
	public Fuego(String nom, int vida) {
			
			
			super.setDefensa(vida);
			super.setNom(nom);
			super.setPrecisio(vida);
			super.setVida(vida);
			
			
			
			
		}
	
	@Override
	public String toString() {
		
		return "Tipo: Fuego \nNom: " + super.getNom() + 
				"\n-Daño base : " + danyBaseF + 
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
