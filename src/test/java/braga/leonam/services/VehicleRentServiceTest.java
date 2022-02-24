package braga.leonam.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import braga.leonam.builders.CarBuilder;
import braga.leonam.builders.ClientBuilder;
import braga.leonam.builders.MotorCycleBuilder;
import braga.leonam.entities.Client;
import braga.leonam.entities.Vehicle;
import braga.leonam.entities.VehicleRent;
import braga.leonam.exceptions.IllegalDaysEntryException;
import braga.leonam.exceptions.NullObjectException;

public class VehicleRentServiceTest {

	private Vehicle car;

	private Vehicle motorCycle;

	private Client client;

	private VehicleRent rent;

	private VehicleRentService service;

	@Before
	public void setup() {
		car = CarBuilder.aCar().now();
		motorCycle = MotorCycleBuilder.aMotocycle().now();
		client = ClientBuilder.aClient().now();
		service = new VehicleRentService();
	}

	@Test
	public void carBuildRentService() {

		rent = service.rent(client, car, 5);

		Assert.assertTrue(rent.isInstanceOfCar(rent.getVehicle()) && rent.getClient().equals(client)
				&& rent.getValue() == 1250.00);

	}

	@Test
	public void motorCycleBuildRentService() {

		rent = service.rent(client, motorCycle, 5);

		Assert.assertTrue(rent.isInstanceOfMotorCycle(rent.getVehicle()) && rent.getClient().equals(client)
				&& rent.getValue() == 750.00);

	}

	@Test
	public void nullClientException() {
		
		client = null;
		
		try {
			service.rent(client, car, 5);
			Assert.fail();
		}catch (NullObjectException e) {
			Assert.assertEquals("Exception test: ", "Client can't be null", e.getMessage());
		}	
	}
	
	@Test
	public void nullVehicleException() {
		
		car = null;
		
		try {
			service.rent(client, car, 5);
			Assert.fail();
		}catch (NullObjectException e) {
			Assert.assertEquals("Exception test: ", "Vehicle can't be null", e.getMessage());
		}	
	}
	
	@Test
	public void illegalDaysException() {
				
		try {
			service.rent(client, car, -5);
			Assert.fail();
		}catch (IllegalDaysEntryException e) {
			Assert.assertEquals("Exception test: ", "The rent day must be before the return day", e.getMessage());
		}	
	}
	
}
