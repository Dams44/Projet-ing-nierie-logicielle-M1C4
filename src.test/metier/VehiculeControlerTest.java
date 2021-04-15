package metier;

import static org.junit.Assert.*;

import org.junit.*;

import ressources.Etat;

public class VehiculeControlerTest {

	public VehiculeControler vehicule= new VehiculeControler();
	
	/*@Before
	public void init() {
		
		
	}*/
	
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