package braga.leonam.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GettersSetterTest {

	private Vehicle car;

	private Vehicle motorCycle;

	private Client client;

	private VehicleRent rent;

	@Before
	public void setup() {
		car = new Car();
		motorCycle = new MotorCycle();
		client = new Client();
		rent = new VehicleRent();
	}

	@Test
	public void carSetAndGetName() {

		car.setName("Corola");

		Assert.assertTrue(car.getName().equals("Corola"));

	}

	@Test
	public void carSetAndGetPrice() {

		car.setPrice(250.00);

		Assert.assertTrue(car.getPrice() == 250.00);
	}
	
	@Test
	public void carSetAndGetSeats() {
		
		car.setSeats(5);
		
		Assert.assertTrue(car.getSeats() == 5);
	}
	
	@Test
	public void carGetWheels() {
				
		Assert.assertTrue(car.getWheels() == 4);
	}
}
