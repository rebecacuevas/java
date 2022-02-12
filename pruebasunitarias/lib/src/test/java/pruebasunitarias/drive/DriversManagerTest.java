package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager driversManager = new DriversManager();
	
	@DisplayName("Pruebas en el método addPassenger")
	
	@Test
	void isAddPassenger() {
		Passenger passenger01 = new Passenger("Andrea", "ASV232");
		driversManager.addPassenger(passenger01);
		assertEquals(passenger01, driversManager.getPassenger("ASV232"));
	}
	
	@Test
	void isAddDriver() {
		Driver driver01 = new Driver("Francisco", "CAD134", 830);
		driversManager.addDriver(driver01);
		assertEquals(driver01, driversManager.getDriver("CAD134"));
	}

}
