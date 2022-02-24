package braga.leonam.entities;

public class MotorCycle extends Vehicle {

	private final Integer WHEELS = 2;

	private Integer seats;

	private Double price;

	public MotorCycle() {
	}

	public MotorCycle(String name, Integer seats, Double price) {
		super(name);
		this.seats = seats;
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
	public Double getPrice() {
		return price;
	}

	@Override
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public Integer getWheels() {
		return WHEELS;
	}


}
