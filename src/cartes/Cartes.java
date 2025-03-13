package cartes;

public class Cartes {
	public String nom;
	public Effet effet; 
	
	
	public Cartes(String nom, Effet effet) {
		this.nom = nom;
		this.effet = effet;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public Effet getEffet() {
		return effet;
	}
	
	public void afficherCarte() {
		System.out.println(nom);
		System.out.println(effet);
	}
}
