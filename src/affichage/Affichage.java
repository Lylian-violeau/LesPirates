package affichage;

import java.util.Scanner;

public class Affichage {
	
	Scanner scanner = new Scanner(System.in);
	//Joueur joueur1 = new Joueur("Jack le Borgne");
	//Joueur joueur2 = new Joueur("Bill Jambe-de-Bois");
	
	
	public String recupNom() {
		System.out.println("Veuillez donnez votre nom.");
		String nomJ1 = scanner.nextLine();
		return nomJ1;
		//joueur1.changerNom(joueur1, nomJ1);
		//System.out.println("Joueur 2, donnez votre nom.");
		//String nomJ2 = scanner.nextLine();
		//joueur1.changerNom(joueur2, nomJ2);		
	}
	
	public void initContexte() {
		System.out.println("Bonjour cher joueur, je serais votre narrateur pour cette aventure.");
		System.out.println("En l'an 1700, le monde traverse une période trouble, les grandes puissances navales s'effondrent sous le poids des guerres et des révoltes laissant place à une nouvelle ère, celle des pirates.");
		System.out.println("Les plus grandes mers sont divisées et contrôlées par les deux plus grands pirates jamais connus.");
	}
	
	public void initRegles() {
		System.out.println("Chaque joueur débute avec 4 cartes, lors de son tour le joueur pioche une carte de sa pioche et l'ajoute à sa main.");
		System.out.println("Il utilise ensuite une de ces 5 cartes et active son effet avant de finir son tour (pour passer le tour, l'utilisation d'une carte est obligatoire).");
		System.out.println("Le tour passe ensuite à celui de l'adversaire.");
		//System.out.println("Le joueur" + joueur1.getNom() + "affrontera le joueur" + joueur2.getNom() + ".");
	}
	
	public void annoceJeu() {
		//initJoueurs();
		initContexte();
		initRegles();
	}
}
