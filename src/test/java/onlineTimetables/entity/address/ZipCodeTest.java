package onlineTimetables.entity.address;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZipCodeTest {

	@Test
	public void testToString() {
		ZipCode firstZipCode = new ZipCode(23, 123);

		assertEquals("23-123", firstZipCode.toString());
	}

	@Test
	public void testEqualsObject() {
		ZipCode firstZipCode = new ZipCode(23, 123);
		ZipCode secondZipCode = new ZipCode(23, 123);
		ZipCode thirdZipCode = new ZipCode(23, 124);
		
		assertNotEquals(firstZipCode, thirdZipCode);
		assertEquals(firstZipCode, secondZipCode);
	}

}
