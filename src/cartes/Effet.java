package cartes;

public enum Effet {
	SOIN("SOIN"),RENOUVEAU("RENOUVEAU"),DECLIN("DECLIN"),ROULETTERUSSE("ROULETTERUSSE"),EGOFRAGILE("EGOFRAGILE"),AURAINSTABLE("AURAINSTABLE"),COUPDESABRE("COUPDESABRE"),ABORDAGEREUSSI("ABORDAGEREUSSI"),MAINDEFER("MAINDEFER"),DISCOURINSPIRANT("DISCOURINSPIRANT"),REVOLTEORGANISEE("REVOLTEORGANISEE");

	private String nom;
	
	Effet(String nom) {
		this.nom = nom;	
	}
	
	
}
