package braga.leonam.entities;

import java.time.Instant;

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
	
	@Test
	public void motorCycleSetAndGetName() {

		motorCycle.setName("Honda Tita");

		Assert.assertTrue(motorCycle.getName().equals("Honda Tita"));

	}

	@Test
	public void motorCycleSetAndGetPrice() {

		motorCycle.setPrice(250.00);

		Assert.assertTrue(motorCycle.getPrice() == 250.00);
	}
	
	@Test
	public void motorCycleSetAndGetSeats() {
		
		motorCycle.setSeats(2);
		
		Assert.assertTrue(motorCycle.getSeats() == 2);
	}
	
	@Test
	public void motorCycleGetWheels() {
				
		Assert.assertTrue(motorCycle.getWheels() == 2);
	}
	
	@Test
	public void clientSetAndGetName() {
		
		client.setName("Leonam Braga");
		
		Assert.assertTrue(client.getName().equals("Leonam Braga"));
		
	}
	
	@Test
	public void clientSetAndGetAge() {
		
		client.setAge(33);
		
		Assert.assertTrue(client.getAge() == 33);
		
	}
	
	@Test
	public void clientSetAndGetBirthDate() {
		
		client.setBirthDate(Instant.parse("1989-12-01T00:00:00Z"));
		
		Assert.assertTrue(client.getBirthDate().equals(Instant.parse("1989-12-01T00:00:00Z")));
		
	}
	
	@Test
	public void vehicleRentSetAndGetClient() {
		
		rent.setClient(new Client("Leonam Braga", 33, Instant.parse("1989-12-01T00:00:00Z")));
		
		Assert.assertTrue(rent.getClient().equals(new Client("Leonam Braga", 33, Instant.parse("1989-12-01T00:00:00Z"))));
				
	}
	
	@Test
	public void vehicleRentSetAndGetVehicle() {
		
		rent.setVehicle(new Car("Corola", 250.00, 5));
		
		Assert.assertTrue(rent.getVehicle().equals(new Car("Corola", 250.00, 5)));
				
	}
	
	@Test
	public void vehicleRentSetAndRentDate() {
		
		rent.setRentDate(Instant.now());
		
		Assert.assertTrue(rent.getRentDate().equals(Instant.now()));
				
	}
	
	@Test
	public void vehicleRentSetAndReturnDate() {
		
		rent.setReturnDate(Instant.now());
		
		Assert.assertTrue(rent.getReturnDate().equals(Instant.now()));
				
	}
	
}
