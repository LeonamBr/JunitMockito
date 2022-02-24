package braga.leonam.entities;

import java.time.Instant;
import java.util.Objects;

public class VehicleRent {

	private Client client;

	private Vehicle vehicle;

	private Instant rentDate;

	private Instant returnDate;

	public VehicleRent() {
	}

	public VehicleRent(Client client, Vehicle vehicle, Instant rentDate, Instant returnDate) {
		this.client = client;
		this.vehicle = vehicle;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Instant getRentDate() {
		return rentDate;
	}

	public void setRentDate(Instant rentDate) {
		this.rentDate = rentDate;
	}

	public Instant getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Instant returnDate) {
		this.returnDate = returnDate;
	}

	public Double getValue() {
		return  (Double.parseDouble((Long.toString(returnDate.toEpochMilli() - rentDate.toEpochMilli())))/(1000*60*60*24))*vehicle.getPrice();
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, rentDate, returnDate, vehicle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleRent other = (VehicleRent) obj;
		return Objects.equals(client, other.client) && Objects.equals(rentDate, other.rentDate)
				&& Objects.equals(returnDate, other.returnDate) && Objects.equals(vehicle, other.vehicle);
	}
	
	public boolean isInstanceOfCar(Vehicle obj) {
		if (obj instanceof Car)
			return true;
		else
			return false;
	}
	
	public boolean isInstanceOfMotorCycle(Vehicle obj) {
		if (obj instanceof MotorCycle)
			return true;
		else
			return false;
	}


	
}
