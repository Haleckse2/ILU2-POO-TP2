package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	
	//TODO a completer
	public boolean isVendeur(String nomVendeur) {
		if (controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur) != null) {
			return true; 
		}
		return false; 
	}
	
	
	
	
	
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer fait
		String[] donneesEtal; 
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur); 
		donneesEtal = etal.etatEtal(); 
		return donneesEtal;
	}

}
