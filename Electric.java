package Pokemon;

public class Electric extends Pokemon {

	final int danyBaseE = 15;
	
	final int defensaE = 10;
	
	final int precisioE = 80;
	
	public Electric(String nom, int vida) {
		
		
		
		super.setDefensa(vida);
		super.setNom(nom);
		super.setPrecisio(vida);
		super.setVida(vida);
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Tipo: Electrico \nNom: " + super.getNom() + 
				"\n-Daño base : " + danyBaseE + 
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
