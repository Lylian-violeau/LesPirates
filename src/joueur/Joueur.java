package joueur;

import cartes.Banc;
import cartes.Main;
import jeu.Jeu;

public class Joueur {
	private String nom;
	private Integer vie;
	private Integer popularite;
	private Main main;
	private Banc banc;
	


	public Joueur(String nom, Banc banc, Main main) {
		this.nom = nom;
		this.vie = 5;
		this.popularite = 0;
		this.banc = banc;
		this.main = main;		
	}
	
	public void piocher(Main main) {
		main.piocherCarte();
	}
	
	public void remettrePioche() {
		main.carteRemettrePioche();
	}
	
	public void afficherMain() {
		main.afficheMain();;
	}
	
	public void afficherBanc() {
		banc.afficheBanc();;
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
