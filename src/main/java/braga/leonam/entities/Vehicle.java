package braga.leonam.entities;

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
	
}
