package com.simplilearn.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class AssertionTest {
	
	String uname = "Shreya";
	int age = 23;
	String email = null;
	
	Object actual = new Object();
	Object reference  = actual;
	
	int[] aNumbers = new int[] { 10, 20, 30 };
	int[] eNumbers = new int[] { 10, 20, 30 };
	
	@Test
	@DisplayName("Should match with expected and actual")
	public void test1()
	{
		
		assertEquals(uname,"Shreya");
		assertEquals(age,23);
		assertEquals(email,null);
		

	}
	@Test
	@DisplayName("Should be true")
	void souldBeTrue() {
		assertTrue(true);
		assertTrue(age > 20);
		
	}
	@Test
	@DisplayName("Should be False")
	void souldBeFalse() {
		assertFalse(false);
		assertFalse(age < 20);
	}
	@Test
	@DisplayName("Should be not null")
	void souldBeNotnull() {
		assertNotNull(uname);
		
	}
	@DisplayName("Should refer to the same object")
	void shouldReferToSameObject() {
		assertSame(reference, actual);
	}
	
	@Test
	@DisplayName("Should contain the same integers array element")
	void shouldContainSameIntegers() {
		assertArrayEquals(aNumbers, eNumbers);
	}

	@Test
	@DisplayName("Should assert mulple Assertions")
	public void lambdaExpressionTest3() {
		int[] numbers = { 0, 1, 20, 3, 40 };
		assertAll("Numbers", () -> assertEquals(numbers[0], 0));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 40));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 40),
				() -> assertEquals(numbers[3], 3));
	}

	@Test
	@DisplayName("Should throw the correct exception")
	void shouldThrowCorrectException() {

		assertThrows(NullPointerException.class, () -> {
			throw new NullPointerException();
		});
	}

	@Test
	@DisplayName("Should not throw an exception")
	void shouldNotThrowException() {
		assertDoesNotThrow(()-> {
			// any logic -> should not throw exception
		});
	}
	

}
