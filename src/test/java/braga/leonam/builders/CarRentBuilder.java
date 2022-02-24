package braga.leonam.builders;

import java.time.Instant;

import braga.leonam.entities.VehicleRent;

public class CarRentBuilder {
	
	private VehicleRent rent;
	
	public CarRentBuilder() {
	}
	
	public static CarRentBuilder aRent() {
		CarRentBuilder builder = new CarRentBuilder();
		builder.rent = new VehicleRent( ClientBuilder.aClient().now(), CarBuilder.aCar().now(), Instant.now(), Instant.now().plusSeconds(5*86400));
		return builder;
	}
	
	public VehicleRent now() {
		return rent;
	}
}
