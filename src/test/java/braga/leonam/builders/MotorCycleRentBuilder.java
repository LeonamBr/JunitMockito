package braga.leonam.builders;

import java.time.Instant;

import braga.leonam.entities.VehicleRent;

public class MotorCycleRentBuilder {
	
	private VehicleRent rent;
	
	public MotorCycleRentBuilder() {
	}
	
	public static MotorCycleRentBuilder aRent() {
		MotorCycleRentBuilder builder = new MotorCycleRentBuilder();
		builder.rent = new VehicleRent(ClientBuilder.aClient().now(), MotorCycleBuilder.aMotocycle().now(), Instant.now(), Instant.now().plusSeconds(5*86400));
		return builder;
	}

	public VehicleRent now() {
		return rent;
	}
}
