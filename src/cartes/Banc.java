package cartes;

public class Banc {
	private Cartes[] banc;
	public static final int NB_MAX = 5;
	
	public Banc() {
		this.banc = new Cartes[NB_MAX];
	}
	
	public void ajouterCartes(Cartes cartes) {
		for(int i = 0; i<NB_MAX; i++) {
			if(banc[i] == null) {
				banc[i] = cartes;;
			}
			else {
				System.out.println("Impossible de piocher vous avez deja 5 cartes");
			}
		}
	}
	
	public void supprimerCartes(Cartes cartes) {
		for(int i = 0; i<NB_MAX; i++) {
			if(banc[i].getNom() == cartes.getNom()) {
				banc[i] = null;
			}
			else {
				System.out.println("Impossible vous ne possedez pas la cartes");
			}
		}
	}
	
	public void afficheBanc() {
		for(int i = 0; i < NB_MAX; i++) {
			System.out.println(banc[i]);
		}
	}

}
