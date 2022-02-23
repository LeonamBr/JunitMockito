package braga.leonam.entities;

public class Car extends Vehicle {

	private final Integer WHEELS = 4;

	private Double price;

	private Integer seats;

	public Car() {
	}

	public Car(String name, Double price, Integer seats) {
		super(name);
		this.price = price;
		this.seats = seats;
	}

	@Override
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getWHEELS() {
		return WHEELS;
	}

}
