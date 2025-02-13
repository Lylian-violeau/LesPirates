package cartes;

import java.util.Random;

public class Pioche {
	private Cartes[] pioche;
	public static final int NB_MAX = 40;
	Random melange = new Random();
	
	public Pioche() {
		this.pioche = new Cartes[NB_MAX];
	}
	
	public void melanger() {
		for(int i=0; i<40;i++) {
			int depla = melange.nextInt(40);
			Cartes tmp = pioche[i];
			pioche[i] = pioche[depla];
			pioche[depla] = tmp;
		}
	}
	
	public Cartes piocher() {
		Cartes carte_pioche = pioche[0];
		for(int i = 0; i<NB_MAX; i++) {
			pioche[i] = pioche[i+1];
		}
		pioche[NB_MAX]= null;
		return carte_pioche;
	}
}
