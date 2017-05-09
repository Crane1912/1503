package isa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameTest {

	@Test
	public void NameTest() {
	Car cname= new Car(100);
	String s= cname.CarName("Nano");
	assertEquals("Nano",s);
	}

}
