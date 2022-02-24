package braga.leonam.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import braga.leonam.builders.CarBuilder;
import braga.leonam.builders.CarRentBuilder;
import braga.leonam.builders.MotorCycleBuilder;
import braga.leonam.builders.MotorCycleRentBuilder;

public class MathValueMethodTest {

	private Vehicle car;

	private Vehicle motorCycle;

	private VehicleRent carRent, MCRent;

	@Before
	public void setup() {
		car = CarBuilder.aCar().now();
		motorCycle = MotorCycleBuilder.aMotocycle().now();
		carRent = CarRentBuilder.aRent().now();
		MCRent = MotorCycleRentBuilder.aRent().now();
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
