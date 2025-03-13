package cartes;

import java.util.Random;
import cartes.Cartes;

public class Pioche {
	private Cartes[] pioche;
	public static final int NB_MAX = 40;
	Random melange = new Random();
	
	public Pioche() {
		this.pioche = new Cartes[NB_MAX];
		for(int i = 0; i<3; i++) {
			pioche[i] = new Cartes("VOLPLANIFIE",Effet.VOLPLANIFIE);
	
			pioche[i+3] = new Cartes("RENOUVEAU",Effet.RENOUVEAU);
		
			pioche[i+6] = new Cartes("DECLIN",Effet.DECLIN);
		
			pioche[i+9] = new Cartes("ROULETTERUSSE",Effet.ROULETTERUSSE);
		
			pioche[i+12] = new Cartes("ROULETTERUSSE",Effet.ROULETTERUSSE);
		
			pioche[i+15] = new Cartes("AURAINSTABLE",Effet.AURAINSTABLE);
		}
		for(int i = 19; i<4; i++) {
			pioche[i] = new Cartes("COUPDESABRE",Effet.COUPDESABRE);
			
			pioche[i+4] = new Cartes("ABORDAGEREUSSI",Effet.ABORDAGEREUSSI);
		
			pioche[i+8] = new Cartes("MAINDEFER",Effet.MAINDEFER);
		
			pioche[i+12] = new Cartes("DISCOURINSPIRANT",Effet.DISCOURINSPIRANT);
		
			pioche[i+16] = new Cartes("REVOLTEORGANISEE",Effet.REVOLTEORGANISEE);
		}		
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
		for(int i = 0; i<NB_MAX-1; i++) {
			pioche[i] = pioche[i+1];
		}
		pioche[NB_MAX-1]= null;
		return carte_pioche;
	}
	
	public void affichePioche() {
		for(int i = 0; i < NB_MAX; i++) {
			System.out.println(pioche[i]);
		}
	}
	 
}
