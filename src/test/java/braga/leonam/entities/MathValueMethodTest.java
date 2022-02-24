package braga.leonam.entities;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathValueMethodTest {

	private Vehicle car;

	private Vehicle motorCycle;

	private Client client;

	private VehicleRent carRent, MCRent;

	@Before
	public void setup() {
		car = new Car("Corola", 250.00, 5);
		motorCycle = new MotorCycle("Fazer", 2, 150.00);
		client = new Client("Leonam Braga", 33, Instant.parse("1989-12-01T00:00:00Z"));
		carRent = new VehicleRent(client, car, Instant.now(), Instant.now().plusSeconds(5 * 86400));
		MCRent = new VehicleRent(client, motorCycle, Instant.now(), Instant.now().plusSeconds(5 * 86400));
	}

	@Test
	public void getCarValue() {

		Assert.assertTrue(carRent.isInstanceOfCar(car) && carRent.getValue() == 1250.00);

	}
	
	@Test
	public void getMotorCycleValue() {

		Assert.assertTrue(MCRent.isInstanceOfMotorCycle(motorCycle) && MCRent.getValue() == 750.00);

	}

}
