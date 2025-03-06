package jeu;

import cartes.Cartes;

public class Zattaque {
	public Cartes[] zattaque;
	public static final int NB_MAX = 1;
	
	
	public void supprimerCarte() {
		if(zattaque[0] != null) {
			zattaque[0] = null;
		}
		else {
			System.out.println("Impossible il n'y a pas de carte dans la zone attaque.");
		}
	}
	
	public void ajouterCarte(Cartes carte) {
		if(zattaque[0] == null) {
			zattaque[0] = carte;
		}
		else {
			supprimerCarte();
			zattaque[0] = carte;
		}
	}
}
