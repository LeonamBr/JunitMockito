package braga.leonam;

import java.time.Instant;

import braga.leonam.entities.Car;
import braga.leonam.entities.Client;
import braga.leonam.entities.Vehicle;
import braga.leonam.entities.VehicleRent;
import braga.leonam.services.VehicleRentService;

public class Program {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car("Corola", 250.00, 5);
		
		Client client = new Client("Leonam Braga", 33, Instant.now());
		
		VehicleRentService service = new VehicleRentService();
		
		VehicleRent rent = service.rent(client, vehicle, 100);

		System.out.printf("%.2f",rent.getValue());
		
	}

}
