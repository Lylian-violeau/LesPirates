package joueur;

import cartes.Main;
import cartes.Pioche;
import jeu.Jeu;

public class Joueur {
	private String nom;
	private Integer vie;
	private Integer popularite;
	private Pioche pioche = new Pioche();
	private Main main = new Main(pioche);
	
	


	public Joueur(String nom, Main main) {
		this.nom = nom;
		this.vie = 5;
		this.popularite = 0;
		this.main = main;		
	}
	
	public void piocher() {
		main.piocherCarte(this.pioche);
	}
	
	public void remettrePioche() {
		main.carteRemettrePioche(this.pioche);
	}
	
	public void afficherMain() {
		System.out.println(main.afficheMain());
	}
	
	public void carteJouer(Jeu game, Joueur jtour, Joueur jadv) {
		main.utiliserCarte(game, jtour, jadv);
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
	
	public void modifVie(int modifVie) {
		vie = vie + modifVie;
	}
	
	public void modifPop(int modifPop) {
		popularite = popularite + modifPop;		
	}
}
