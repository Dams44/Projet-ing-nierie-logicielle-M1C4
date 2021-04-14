package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lejos.robotics.RegulatedMotor;

public class MotorTest {
	
	public Motor motor;
	public RegulatedMotor motorLejos;
	
	
	
	@Before
	public void init() {
		
		motor = new Motor( motorLejos);
		
	}

	@Test
	public void setVitesseTest(int vitesse) {
		
		motor.setVitesse(vitesse);
		
		assertEquals(vitesse,motor.getVitesse());
		
	}
	
	@Test
	public void pullTest(int vitesse) {
		motor.pull(vitesse);
		assertEquals(vitesse,motor.getVitesse());
	}
	
	@Test
	public void stopTest() {
	
		motor.stopped();
		assertEquals(0,motor.getVitesse());
		
	}
	
}
