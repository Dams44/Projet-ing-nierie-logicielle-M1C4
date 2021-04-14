package metier;

import static org.junit.Assert.*;

import org.junit.*;

import ressources.Etat;

public class VehiculeControlertest {

	public VehiculeControler vehicule;
	
	
	@Before
	public void init() {
		
		vehicule = new VehiculeControler();
	}
	
	/**
	 * Test setEtatVehicule()
	 */
	@Test
	public void testSetEtat() {
		
		Etat etat =  Etat.off;
		vehicule.setEtatVehicule(etat);
		assertEquals(etat,vehicule.getEtatVehicule());
	}
}
