package cartes;

import java.util.Scanner;

public class Main {
	private Cartes[] main;
	public static final int NB_MAX = 5;
	public static Scanner sc = new Scanner(System.in);
	Pioche pioche = new Pioche();
	
	public Main() {
		this.main = new Cartes[NB_MAX];
	}
	
	public void afficheMain() {
		for(int i = 0; i < NB_MAX; i++) {
			System.out.println(main[i]);
		}
	}
	
	public void jouerCarte(Cartes carte) {
		System.out.println("Vous jouer la carte:");
		carte.getNom();
		//application des effets de la carte
	}
	
	public void utiliserCarte() {
		System.out.println("Voici votre main :");
		afficheMain();
		System.out.println("Choisissz une carte a jouer entre 1 et 5:");
		int carteJ = sc.nextInt();
		switch(carteJ) {
			case 1:
				System.out.println("Vous jouer la carte n�1");
				jouerCarte(main[0]);
				main[0] = null;
				break;
			
			case 2:
				System.out.println("Vous jouer la carte n�2");
				jouerCarte(main[1]);
				main[1] = null;
				break;
			
			case 3:
				System.out.println("Vous jouer la carte n�3");
				jouerCarte(main[2]);
				main[2] = null;
				break;
				
			case 4:
				System.out.println("Vous jouer la carte n�4");
				jouerCarte(main[3]);
				main[3] = null;
				break;
				
			case 5:
				System.out.println("Vous jouer la carte n�5");
				jouerCarte(main[4]);
				main[4] = null;
				break;
		}
	}
	
	public void piocherCarte() {
		for(int i = 0; i<NB_MAX; i++) {
			if(main[i] == null) {
				main[i] = pioche.piocher();
			}
			else {
				System.out.println("Impossible de piocher vous avez deja 5 cartes");
			}
		}		
	}
}
