package onlineTimetables.entity.address;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoordinatesTest {

	@Test
	public void testGetCoordinates() {
		Coordinates coordinates = new Coordinates();
//		assertFalse(coordinates.addLatitude("W"));
//		assertTrue(coordinates.addLatitude("N"));
//		
//		assertFalse(coordinates.addLatitudeDegree("91"));
//		assertTrue(coordinates.addLatitudeDegree("44"));
//		
//		assertFalse(coordinates.addLatitudeMinute("61"));
//		assertTrue(coordinates.addLatitudeMinute("43"));
//		
//		assertTrue(coordinates.addLatitudeSecond("15"));
//		assertFalse(coordinates.addLatitudeSecond("766.7656"));
//		assertTrue(coordinates.addLatitudeSecond("23.232123"));
//		
//		assertFalse(coordinates.addLongitude("N"));
//		assertTrue(coordinates.addLongitude("W"));
//		
//		assertFalse(coordinates.addLongitudeDegree("181"));
//		assertTrue(coordinates.addLongitudeDegree("122"));
//		
//		assertTrue(coordinates.addLongitudeMinute("12"));
//		
//		assertTrue(coordinates.addLongitudeSecond("55.3332"));
		
		assertTrue(("44\u00B043'23.2\"N 122\u00B012'55.3\"W").equals(coordinates.getCoordinates()));
	}

}
