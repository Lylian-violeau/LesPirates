package cartes;

import joueur.Joueur;

public class Cartes {
	///Type a definir
	public String nom;
	
	
	//Constructeur a faire
	
	public String getNom() {
		return nom;
	}
	
	public enum Effets{
		//Tuple chiant a faire mais faisable avec une autre methode a part
	}
	
	public void perdreVieAdv(Joueur j2, Integer nb) {
		for(int i = 0 ; i<nb ; i++) {
			j2.perdreVie(j2);
		}
	}
	
	public void perdreVieSelf(Joueur j1, Integer nb) {
		for(int i = 0 ; i<nb ; i++) {
			j1.perdreVie(j1);
		}
	}
	
	public void gagnerVieAdv(Joueur j2, Integer nb) {
		for(int i = 0 ; i<nb ; i++) {
			j2.perdreVie(j2);
		}
	}
	
	public void gagnerVieSelf(Joueur j1, Integer nb) {
		for(int i = 0 ; i<nb ; i++) {
			j1.perdreVie(j1);
		}
	}
	
}
