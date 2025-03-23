package cartes;

import java.util.Random;
import cartes.Cartes;

public class Pioche {
	private Cartes[] pioche;
	public static final int NB_MAX = 44;
	Random melange = new Random();
	
	public Pioche() {
		this.pioche = new Cartes[NB_MAX];
		for(int i = 0; i<4; i++) {	
			pioche[i] = new Cartes("RENOUVEAU",Effet.RENOUVEAU);
		
			pioche[i+4] = new Cartes("DECLIN",Effet.DECLIN);
		
			pioche[i+8] = new Cartes("ROULETTERUSSE",Effet.ROULETTERUSSE);
		
			pioche[i+12] = new Cartes("ROULETTERUSSE",Effet.ROULETTERUSSE);
		
			pioche[i+16] = new Cartes("AURAINSTABLE",Effet.AURAINSTABLE);

			pioche[i+20] = new Cartes("COUPDESABRE",Effet.COUPDESABRE);
			
			pioche[i+24] = new Cartes("ABORDAGEREUSSI",Effet.ABORDAGEREUSSI);
		
			pioche[i+28] = new Cartes("MAINDEFER",Effet.MAINDEFER);
		
			pioche[i+32] = new Cartes("DISCOURINSPIRANT",Effet.DISCOURINSPIRANT);
		
			pioche[i+36] = new Cartes("REVOLTEORGANISEE",Effet.REVOLTEORGANISEE);
			
			pioche[i+40] = new Cartes("SOIN",Effet.SOIN);
		}
		melanger();
	}
	
	public void melanger() {
		for(int i=0; i<NB_MAX;i++) {
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
	 
}
