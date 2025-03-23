package cartes;

public class Cartes {
	public String nom;
	public Effet effet; 
	
	
	protected Cartes(String nom, Effet effet) {
		this.nom = nom;
		this.effet = effet;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public Effet getEffet() {
		return effet;
	}
}
