package controleur;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {

	ControlTrouverEtalVendeur control;
	ControlPrendreEtal controlPrendreEtal;
	ControlVerifierIdentite controlVerifierIdentite;
	Gaulois asterix;
	Village village;
	Etal etalAttendu;
	Etal etalRecu;

	@BeforeEach
	void setUp() throws Exception {
		controlVerifierIdentite = new ControlVerifierIdentite(village);
		controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);

		village = new Village("Le village", 10, 10);
		control = new ControlTrouverEtalVendeur(village);
		Chef chef = new Chef("c", 5, village);
		village.setChef(chef);

	}

	@Test
	void testTrouverEtalVendeur() {
		asterix = new Gaulois("Asterix", 15);
		village.ajouterHabitant(asterix);
		village.installerVendeur(asterix, "caramouul", 18);
		etalRecu = control.trouverEtalVendeur("Asterix");
		assertNotNull(etalRecu);
		assertEquals("Asterix", etalRecu.getVendeur().getNom());
	}

	@Test
	void grosTest() {
		assertTrue(village.rechercherEtalVide());

	}

}
