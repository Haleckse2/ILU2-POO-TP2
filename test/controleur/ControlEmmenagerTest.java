package controleur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Druide;
import villagegaulois.Village;

class ControlEmmenagerTest {

	ControlEmmenager control;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("Village de test", 10, 10);

		Druide druide = new Druide("Wowo", 4, 2, 8);
		control = new ControlEmmenager(village);
		Chef chef = new Chef("Chef", 10, village);
		village.setChef(chef);
	}

	@Test
	void testIsHabitant() {
		control.ajouterGaulois("Asterix", 10);
		assertTrue(control.isHabitant("Asterix"));
		assertFalse(control.isHabitant("Obelix"));
	}

	@Test
	void testAjouterDruide() {
		control.ajouterDruide("D_", 4, 2, 8);
	}

	@Test
	void testAjouterTropGaulois() {
		for (int i = 0; i < 10; i++) {
			control.ajouterGaulois("A_" + i, 4);
		}
		control.ajouterGaulois("Billy", 4);
		assertFalse(control.isHabitant("Billy"));
	}

//	void testAjouterTropDruide() {
//		for (int i = 0; i < 10; i++) {
//			control.ajouterDruide("D_" + i, 4, 2, 8);
//		}
//
//		control.ajouterDruide("Billy", 4, 2, 8);
//		assertFalse(control.isHabitant("Billy"));
//	}

}
