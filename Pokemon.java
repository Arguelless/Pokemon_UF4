package Pokemon;

import java.util.Random;
public abstract class Pokemon {
	
	Random rn = new Random();
	
	final int energy = 100;
	
	private int defensa;
	
	private int precisio;
	
	private String nom;
	
	private int energia = energy;
	
	private int vida;
	
	
	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}



	public abstract void resetStats();



	public void setEnergia(int energia) {
		this.energia = energia;
	}



	public int getDefensa() {
		return defensa;
	}



	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}



	public int getPrecisio() {
		return precisio;
	}



	public void setPrecisio(int precisio) {
		this.precisio = precisio;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getEnergia() {
		return energia;
	}



	
	
	
	

}
