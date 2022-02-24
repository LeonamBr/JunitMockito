package braga.leonam.services;

import java.time.Instant;

import braga.leonam.DAO.IRentDAO;
import braga.leonam.entities.Client;
import braga.leonam.entities.Vehicle;
import braga.leonam.entities.VehicleRent;
import braga.leonam.exceptions.IllegalDaysEntryException;
import braga.leonam.exceptions.NullObjectException;

public class VehicleRentService {
	
	private IRentDAO dao;
	
	public VehicleRent rent(Client client, Vehicle vehicle, Integer days) {
		
		if (vehicle == null)
			throw new NullObjectException("Vehicle can't be null");
		if (client == null)
			throw new NullObjectException("Client can't be null");
			
		VehicleRent rent = new VehicleRent(client, vehicle, Instant.now(), Instant.now().plusSeconds(days*86400));
	
		if (rent.getValue() < 0)
			throw new IllegalDaysEntryException("The rent day must be before the return day");
		
		dao.save(rent);
		
		return rent;
	}
	
	public void setDAO(IRentDAO dao) {
		this.dao = dao;
	}

}
