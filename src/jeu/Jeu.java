package jeu;

import affichage.Affichages;
import cartes.Banc;
import cartes.Cartes;
import cartes.Main;
import cartes.Pioche;
import joueur.Joueur;

public class Jeu {
	private Joueur joueur1;
	private Joueur joueur2;
	private Pioche pioche;
	//private Zattaque zattaque; a creer
	private Integer tours;
	
	
	public Jeu() {
		this.joueur1 = new Joueur("");
		this.joueur2 = new Joueur("");
		this.pioche = new Pioche();
		//this.zattaque = new Zattaque(); a faire
		this.tours = 0;
	}
	
	public void startJeu() {
		Affichages.annonceJeu();
	}
	
	public Integer getTours() {
		return tours;
	}

}
