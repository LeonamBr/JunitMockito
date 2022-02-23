package braga.leonam.entities;

import java.util.Objects;

public abstract class Vehicle {
	
	private String name;
	
	public Vehicle() {
	}

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected abstract Double getPrice();
	
	protected abstract void setPrice(Double price);
	
	protected abstract Integer getSeats();
	
	protected abstract void setSeats(Integer seats);
	
	protected abstract Integer getWheels();

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(name, other.name);
	}
	
}
