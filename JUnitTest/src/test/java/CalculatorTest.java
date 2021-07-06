import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	//@BeforeAll
	//@AfterAll
	//@BeforeEach
	//@AfterEach
	
	//assertNotEqual()
	//assertNull()
	//assertNotNull()
	//assertTrue()
	//assertFalse()
	//assertArrayEquals()
	
	@Test
	void testAdd() {
		Calculator clsCalc = new Calculator();
		if (clsCalc.add(1,5) != 6) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testSubtract() {
		if (Calculator.subtract(10, 5) != 5) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testMultiply() {
		assertEquals(Calculator.multiply(2, 5), 10);
	}
	
	@Test
	void testDivide() {
		assertEquals(Calculator.divide(10, 2), 5);
	}
}
