package cartes;

import java.util.Random;
import java.util.Scanner;
import jeu.Jeu;
import joueur.Joueur;

public class Main {
	private Cartes[] main;
	public static final int NB_MAX = 5;
	public static Scanner sc = new Scanner(System.in);
	Pioche pioche = new Pioche();
	Random nbRandom = new Random();
	
	public Main(Pioche pioche) {
		this.main = new Cartes[NB_MAX];
		for (int i = 0; i<4;i++) {
			piocherCarte(pioche);
		}
	}
	
	public void afficheMain(Jeu jeu) {
		for(int i = 0; i < NB_MAX; i++) {
			jeu.afficherCarte(main[i]);
		}
	}
	
	public void jouerCarte(Cartes carte, Joueur jtour, Joueur jadv) {
		
		switch(carte.getNom()) {
			case "COUPDESABRE" :
				jadv.modifVie(-2);
				break;
				
			case "ABORDAGEREUSSI":
				jtour.modifPop(1);
				break;
			
			case "MAINDEFER":
				jtour.modifPop(2);
				jtour.modifVie(-1);
				break;
			
			case "DISCOURINSPIRANT":
				jtour.modifPop(1);
				break;
				
			case "REVOLTEORGANISEE":
				jtour.modifPop(1);
				break;
				
			case "RENOUVEAU":
				jtour.remettrePioche();
				break;
				
			case "DECLIN":
				jadv.remettrePioche();
				break;
				
			case "ROULETTERUSSE":
				int val = nbRandom.nextInt(2);
				if (val == 0) {
					jtour.modifPop(2);
				}
				else {
					jtour.modifVie(-1);
				}
				break;
			
			case "EGOFRAGILE":
				if(jtour.getPop() <= 2) {
					jtour.modifVie(1);
				}
				else {
					jtour.modifVie(-1);
				}
				break;
				
			case "AURAINSTABLE":
				if(jtour.getVie() >= 3) {
					jtour.modifPop(1);
				}
				else {
					jtour.modifPop(-1);
				}
				break;
		}
	}
	
	public void utiliserCarte(Jeu jeu, Joueur jtour, Joueur jadv) {
		jeu.afficherJouerCarte();
		afficheMain(jeu);
		int carteJ = sc.nextInt();
		switch(carteJ) {
			case 1:
				jeu.afficheChoixCarte(1);
				jouerCarte(main[0],jtour, jadv);
				main[0] = null;
				break;
			
			case 2:
				jeu.afficheChoixCarte(2);
				jouerCarte(main[1],jtour, jadv);
				main[1] = null;
				break;
			
			case 3:
				jeu.afficheChoixCarte(3);
				jouerCarte(main[2],jtour, jadv);
				main[2] = null;
				break;
				
			case 4:
				jeu.afficheChoixCarte(4);
				jouerCarte(main[3],jtour, jadv);
				main[3] = null;
				break;
				
			case 5:
				jeu.afficheChoixCarte(5);
				jouerCarte(main[4],jtour, jadv);
				main[4] = null;
				break;
		}
	}
	
	public void piocherCarte(Pioche pioche) {
		for(int i = 0; i<NB_MAX; i++) {
			if(main[i] == null) {
				main[i] = pioche.piocher();
			}
		}		
	}
	
	public void carteRemettrePioche() {
		for(int i = 0; i<NB_MAX; i++) {
			if(main[i] != null) {
				main[i] = null;
			}
		}
		for(int i = 0; i<4; i++) {
			//piocherCarte(); a revoir la methode
		}
	}
}
