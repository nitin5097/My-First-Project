package roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumbersConversionTest {

	@Test
	public void testReturn1990() {
	    String actual = RomanNumbersConversion.stringToRoman(1990);
	    String expected = "MCMXC";
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn2008() {
	    String actual = RomanNumbersConversion.stringToRoman(2008);
	    String expected = "MMVIII";
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn99() {
	    String actual = RomanNumbersConversion.stringToRoman(99);
	    String expected = "XCIX";
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn47() {
	    String actual = RomanNumbersConversion.stringToRoman(47);
	    String expected = "XLVII";
	    assertEquals(expected, actual);
	}

}
