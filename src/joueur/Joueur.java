package joueur;

import cartes.Main;
import affichage.Affichage;

public class Joueur {
	private String nom;
	private Integer vie;
	private Integer popularite;
	private Main main;
	


	public Joueur(String nom) {
		this.nom = nom;
		this.vie = 5;
		this.popularite = 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Integer getVie() {
		return vie;
	}
	
	public Integer getPop() {
		return popularite;
	}
	
	public void gagnerVie(Joueur j1) {
		j1.vie = j1.vie+1;
	}
	
	public void perdreVie(Joueur j1) {
		j1.vie = j1.vie-1;
	}
	
	public void gagnerPop(Joueur j1) {
		j1.popularite = j1.popularite+1;
	}
	
	public void perdrePop(Joueur j1) {
		j1.popularite = j1.popularite-1;
	}
	
	public void afficherMain() {
		System.out.println(this.main);
	}
}
