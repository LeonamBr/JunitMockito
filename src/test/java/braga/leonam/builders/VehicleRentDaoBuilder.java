package braga.leonam.builders;

import org.mockito.Mock;
import org.mockito.Mockito;

import braga.leonam.DAO.IRentDAO;

public class VehicleRentDaoBuilder {
	
	@Mock
	private IRentDAO dao;
	
	public VehicleRentDaoBuilder() {
	}
	
	public static VehicleRentDaoBuilder aDaoMock() {
		
		VehicleRentDaoBuilder builder = new VehicleRentDaoBuilder();
		builder.dao = Mockito.mock(IRentDAO.class);
		return builder;
	}
	
	public IRentDAO now() {
		return dao;
	}

}
