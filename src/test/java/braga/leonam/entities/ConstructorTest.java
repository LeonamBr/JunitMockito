package braga.leonam.entities;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorTest {

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
	public void carConstructor() {
		Assert.assertTrue(car.getName().equals("Corola") && car.getPrice() == 250.00 && car.getSeats() == 5);
	}

	@Test
	public void motorCycleConstructor() {
		Assert.assertTrue(
				motorCycle.getName().equals("Fazer") && motorCycle.getPrice() == 150.00 && motorCycle.getSeats() == 2);
	}

	@Test
	public void clientConstructor() {
		Assert.assertTrue(client.getName().equals("Leonam Braga")
				&& client.getBirthDate().equals(Instant.parse("1989-12-01T00:00:00Z")) && client.getAge() == 33);
	}

	@Test
	public void carRentConstructor() {
		Assert.assertTrue(carRent.isInstanceOfCar(car) && carRent.getClient().equals(client) && carRent.getRentDate().equals(Instant.now()) && carRent.getReturnDate().equals(Instant.now().plusSeconds(5*86400)));
	}
	
	@Test
	public void motorCycleRentConstructor() {
		Assert.assertTrue(carRent.isInstanceOfMotorCycle(motorCycle) && MCRent.getClient().equals(client) && MCRent.getRentDate().equals(Instant.now()) && MCRent.getReturnDate().equals(Instant.now().plusSeconds(5*86400)));
	}

}
