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

	@Override
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public Integer getSeats() {
		return seats;
	}

	@Override
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public Integer getWheels() {
		return WHEELS;
	}

}
