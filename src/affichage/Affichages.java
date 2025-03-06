package affichage;

public interface Affichages {
	
	public static void afficherFinTour() {
		
	}
	
	public static  void afficherContexte() {
		System.out.println("Bonjour cher joueur, je serais votre narrateur pour cette aventure.");
		System.out.println("En l'an 1700, le monde traverse une période trouble, les grandes puissances navales s'effondrent sous le poids des guerres et des révoltes laissant place à une nouvelle ère, celle des pirates.");
		System.out.println("Les plus grandes mers sont divisées et contrôlées par les deux plus grands pirates jamais connus.");
	}
	
	public static  void afficherRegle() {
		System.out.println("Chaque joueur débute avec 4 cartes, lors de son tour le joueur pioche une carte de sa pioche et l'ajoute à sa main.");
		System.out.println("Il utilise ensuite une de ces 5 cartes et active son effet avant de finir son tour (pour passer le tour, l'utilisation d'une carte est obligatoire).");
		System.out.println("Le tour passe ensuite à celui de l'adversaire.");
		//System.out.println("Le joueur" + joueur1.getNom() + "affrontera le joueur" + joueur2.getNom() + ".");
	}
	
	public static void afficherMain() {
		
	}
	
	public static void afficherBanc() {
		
	}
	
	public static void annonceJeu() {
		//initJoueurs();
		afficherContexte();
		afficherBanc();
	}
}
