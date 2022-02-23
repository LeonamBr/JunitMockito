package braga.leonam.entities;

public class MotorCycle extends Vehicle{
	
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

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getWHEELS() {
		return WHEELS;
	}

}
