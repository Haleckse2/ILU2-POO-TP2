package controleur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherVillageTest {

	ControlAfficherVillage control;
	Village village;
	Chef chef;
	Gaulois asterix;
	Gaulois billy;

	@BeforeEach
	void setUp() throws Exception {
		village = new Village("Village de test", 10, 10);
		control = new ControlAfficherVillage(village);
		chef = new Chef("Le chef", 10, village);
		village.setChef(chef);

		asterix = new Gaulois("Asterix", 10);
		billy = new Gaulois("Billy", 15);

		village.ajouterHabitant(asterix);
		village.ajouterHabitant(billy);

	}

	@Test
	void testControlAfficherVillage() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNomsVillageois() {
		String[] donneesPresume = control.donnerNomsVillageois();
		String[] donneesVoulu = { "Le Chef", "Asterix", "Billy" };

	}

	@Test
	void testDonnerNomVillage() {
		String nomVillagePresume = control.donnerNomVillage();
		assertEquals(nomVillagePresume, village.getNom());

	}

	@Test
	void testDonnerNbEtals() {
		fail("Not yet implemented");
	}

}
