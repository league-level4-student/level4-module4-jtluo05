package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CapsulateTest {

	@Test
	void test() {
		EncapsulateTheData etd=new EncapsulateTheData();
		
		
		etd.setIR(-1);
		assertEquals(0,etd.getIR());
		
		etd.setDT(190);
		assertEquals(190.0,etd.getDT(),0.01);

		
		etd.setN("jordan");
		assertEquals("jordan",etd.getN());

		
		etd.setMO(int.class);
		assertEquals(int.class,etd.getMO());

	}

}
