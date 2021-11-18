//Q4

package Junitques4;

public class Calculator {
	 
	public int add(int a, int b) {
		return a+b;
	}

}

// secound progream

package Junitques4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleHooksAnnotation {
	Calculator cal;

	@BeforeAll
	static void SetupAll() {
		System.out.println("@BeforAll Method");

	}

	@BeforeEach
	void setup() {
		cal = new Calculator();
		System.out.println("@BeforeEach Method");
	}

	@Test
	void test() {

		int expected = 5;
		int actual = cal.add(2, 3);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test2() {
		int expected = 8;
		int actual = cal.add(4, 4);
		assertEquals(expected, actual);
		System.out.println(actual);

	}

	@AfterEach
	void setup2() {
		System.out.println("@AfteEach Method");
	}

	@AfterAll
	static void SetupAll2() {
		System.out.println("@AfterAll Method");

	}

}