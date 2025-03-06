package joueur;

import cartes.Banc;
import cartes.Main;
import affichage.Affichages;
import cartes.Pioche;

public class Joueur {
	private String nom;
	private Integer vie;
	private Integer popularite;
	private Main main;
	private Banc banc;
	//public Pioche pioche;
	


	public Joueur(String nom) {
		this.nom = nom;
		this.vie = 5;
		this.popularite = 0;
	}
	
	public void creerMain() {
		main = new Main();
	}
	
	public void afficherMain() {
		System.out.println(main);
	}
	
	public void afficherBanc() {
		System.out.println(banc);
	}
	
	//faire methode effet carte qui est dans main PB JOUEUR A PAS ACCES A LA CLASSE CARTE
	//faire methode piocher PB ELLE EST DANS CLASSE MAIN SELON MOI
	
	public String getNom() {
		return nom;
	}
	
	public Integer getVie() {
		return vie;
	}
	
	public Integer getPop() {
		return popularite;
	}
	
	public void modifVie(Integer modifVie) {
		vie = vie + modifVie;
	}
	
	public void modifPop(Integer modifPop) {
		popularite = popularite + modifPop;		
	}
}
