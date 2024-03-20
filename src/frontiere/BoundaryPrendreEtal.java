package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;
import controleur.ControlVerifierIdentite;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Bonjour " + nomVendeur + " Je vais regarder si je peux trouver un etal pour vous. ");
		}
		else {
			System.out.println("Je suis désolé, il faut etre un habitant du village pour avoir un etal");
		}
		
		if (controlPrendreEtal.resteEtals()) {
			installerVendeur(nomVendeur); 
		}
		else {
			System.out.println("Désole je n'ai plus n'étals pour vous");
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		System.out.println("C'est parfait il me reste un étal pour vous ! "); 
		System.out.println("Il me faudrait des renseignements "); 
		System.out.println("Quelle produit voulez vous vendre?");
		
		Scanner sc = new Scanner(System.in); 
		String produit = sc.nextLine(); 
		
		int nbProduit = Clavier.entrerEntier("Combien de produit?"); 
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit
		if(numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + " s'est installé a l'étal numéro" + numeroEtal);
		}
	}
}
