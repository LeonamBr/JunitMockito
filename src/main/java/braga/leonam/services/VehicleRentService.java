package braga.leonam.services;

import java.time.Instant;

import braga.leonam.entities.Client;
import braga.leonam.entities.Vehicle;
import braga.leonam.entities.VehicleRent;

public class VehicleRentService {
	
	public VehicleRent rent(Client client, Vehicle vehicle, Integer days) {
		
		VehicleRent rent = new VehicleRent(client, vehicle, Instant.now(), Instant.now().plusSeconds(days*86400));
		
		return rent;
	}

}
