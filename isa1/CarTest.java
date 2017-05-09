package isa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void CheckCapacity() {
		Car car1= new Car();
		int c=car1.getEngineCapacity();
		assertEquals(1000,c);
	}

}
