package braga.leonam.builders;

import braga.leonam.entities.Car;
import braga.leonam.entities.Vehicle;

public class CarBuilder {
	
	private Vehicle car;
	
	public CarBuilder() {
	}

	public static CarBuilder aCar() {
		CarBuilder builder = new CarBuilder();
		builder.car = new Car("Corola", 250.00, 5);
		return builder;
	}
	
	public Vehicle now() {
		return car;
	}
}
