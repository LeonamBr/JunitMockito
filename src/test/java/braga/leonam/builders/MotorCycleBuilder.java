package braga.leonam.builders;

import braga.leonam.entities.MotorCycle;
import braga.leonam.entities.Vehicle;

public class MotorCycleBuilder {
	
	private Vehicle motoCycle;
	
	public MotorCycleBuilder() {
	}
	
	public static MotorCycleBuilder aMotocycle() {
		MotorCycleBuilder builder = new MotorCycleBuilder();
		builder.motoCycle = new MotorCycle("Fazer", 2, 150.00);
		return builder;
	}

	public Vehicle now() {
		return motoCycle;
	}
}
