package jeu;

import java.util.Scanner;

import cartes.Banc;
import cartes.Cartes;
import cartes.Main;
import cartes.Pioche;
import joueur.Joueur;

public class Jeu {
	private static Scanner scanner = new Scanner(System.in);
	
	public void afficherContexte() {
		System.out.println("Contexte du Jeu :");
		System.out.println("\tBonjour cher joueur, je serais votre narrateur pour cette aventure.");
		System.out.println("\tEn l'an 1700, le monde traverse une période trouble, les grandes puissances navales s'effondrent sous le poids des guerres et des révoltes laissant place à une nouvelle ère, celle des pirates.");
		System.out.println("\tLes plus grandes mers sont divisées et contrôlées par les deux plus grands pirates jamais connus.");
	}
	
	public  void afficherRegle() {
		System.out.println("Règles du Jeu :");
		System.out.println("Chaque joueur débute avec 4 cartes, lors de son tour le joueur pioche une carte de sa pioche et l'ajoute à sa main.");
		System.out.println("Il utilise ensuite une de ces 5 cartes et active son effet avant de finir son tour (pour passer le tour, l'utilisation d'une carte est obligatoire).");
		System.out.println("Le tour passe ensuite à celui de l'adversaire.");
	}
	public String afficheNomJoueur(int nbJoueur) {
		String nom = "";
		if (nbJoueur == 1) {
			System.out.println("Veuillez entrer le nom du " + nbJoueur +"ere pirate");
			nom = scanner.nextLine();
		}
		else if (nbJoueur == 2) {
			System.out.println("Veuillez entrer le nom du " + nbJoueur +"eme pirate");
			nom = scanner.nextLine();
		}
		else {
			System.out.println("Erreur sur le nombre de joueur !!!");
		}
		return nom;
	}
	
	public void afficherStart(Joueur j1, Joueur j2) {
		System.out.println("\nL'impitoyable pirate " + j1.getNom() + " sera en duel face au terrible pirate " + j2.getNom() + ".");
	}
	
	public void afficherCarte(Cartes carte) {
		System.out.println(carte.getNom());
		System.out.println(carte.getEffet());
	}
	
	public void afficherJouerCarte() {
		System.out.println("\nVoici votre main :");
		System.out.println("\nChoisissz une carte a jouer entre 1 et 5:");
	}
	
	public void afficheChoixCarte(int numCarte) {
		System.out.println("Vous jouer la carte " + numCarte + ".");
	}
	
	public int tourA(int tour) {
		tour = tour + 1;
		System.out.println("\n############################");
		System.out.println("\n\tTour : " + tour);
		return tour;
	}
	
	public void tourJoueur(Main main, Joueur j) {
		j.piocher(main);
		System.out.println("\nVous :");
		System.out.println(j.getNom() + " : " + j.getVie() + " PV et " + j.getPop() + " Popularité");
		j.afficherBanc();
		j.afficherMain();
	}
	
	public void tourAdv(Joueur adv) {
		System.out.println("\nAdversaire :");
		System.out.println(adv.getNom() + " : " + adv.getVie() + " PV et " + adv.getPop() + " Popularité");
		adv.afficherBanc();;
	}
	
	public void vaiqueur(Joueur j) {
		System.out.println("\nLe vainqueur est le pirate " + j.getNom() + ". Félicitation !!!");
	}
	
	public void afficheJeu(Joueur j1, Joueur j2) {
		System.out.println("\n############################");
		System.out.println(j1.getNom() + " : " + j1.getVie() + " PV et " + j1.getPop() + "Popularité");
		j1.afficherBanc();
		j1.afficherMain();
		
		System.out.println(j2.getNom() + " : " + j2.getVie() + " PV et " + j2.getPop() + "Popularité");
		j2.afficherBanc();
		j2.afficherMain();
	}
	
	public void jeuCarte(Jeu game, Joueur jtour, Joueur jadv) {
		jtour.carteJouer(game, jtour, jadv);
	}
	
	public static void main(String[] args) {

		Pioche pioche = new Pioche();

		Jeu game = new Jeu();
		Joueur gagnant;
		
		game.afficherContexte();
		game.afficherRegle();
		
		Main mainj1 = new Main();
		Banc bancj1 = new Banc();
		Joueur joueur1 = new Joueur(game.afficheNomJoueur(1), bancj1, mainj1);
		
		Main mainj2 = new Main();
		Banc bancj2 = new Banc();
		Joueur joueur2 = new Joueur(game.afficheNomJoueur(2), bancj2, mainj2);
		
		game.afficherStart(joueur1, joueur2);
		
		int tour = 0;

		while(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPop() < 5 && joueur2.getPop() < 5) {
			tour = game.tourA(tour);
			
			game.tourJoueur(mainj1, joueur1);
			game.tourAdv(joueur2);
			game.jeuCarte(game, joueur1, joueur2);
	
			if(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPop() < 5 && joueur2.getPop() < 5) {
				game.tourJoueur(mainj2, joueur2);
				game.tourAdv(joueur1);
				game.jeuCarte(game, joueur2, joueur1);
			}
		}
		
		if(joueur1.getVie() <= 0 || joueur2.getPop() >= 5) {
			gagnant = joueur2;
		}else {
			gagnant = joueur1;
		}
		
		pioche.affichePioche();
		
		game.afficheJeu(joueur1, joueur2);
		
		game.vaiqueur(gagnant);
	}
}

