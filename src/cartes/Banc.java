package cartes;

public class Banc {
	private Cartes[] banc;
	public static final int NB_MAX = 5;
	
	public Banc() {
		this.banc = new Cartes[NB_MAX];
	}
}
