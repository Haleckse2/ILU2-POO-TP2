package controleur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	ControlEmmenager control1;
	ControlVerifierIdentite control2;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("Village de test", 10, 10);
		control1 = new ControlEmmenager(village);
		control2 = new ControlVerifierIdentite(village);
		Chef chef = new Chef("Chef", 10, village);
		village.setChef(chef);
	}

	@Test
	void testControlVerifierIdentite() {
		control1.ajouterGaulois("Asterix", 10);
		assertTrue(control2.verifierIdentite("Asterix"));
		assertFalse(control2.verifierIdentite("Obelix"));
	}

}
