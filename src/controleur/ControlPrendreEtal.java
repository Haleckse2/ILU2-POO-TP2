package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)fait
		return village.rechercherEtalVide(); 
		
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		Gaulois gaulois = village.trouverHabitant(nomVendeur); 
		return village.installerVendeur(gaulois, produit, nbProduit); 
		
//		int numeroEtal = -1;
//		return numeroEtal;	
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-) fait
		
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
	}
}
