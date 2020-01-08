package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("LES TESTS")
class ImpUtilTest {
	
	static ImpUtil iu = new ImpUtil();
	
	static int cpt = 0;
	
	@AfterEach
	public void incrCount() {
		cpt++;
	}
	
	@AfterAll
	public static void AfficheCount() {
		System.out.println("counts tests :" + cpt);
	}
	
	@BeforeAll
	@DisplayName("test class ImpUtil")
	public static void classTest() {
		assertEquals("class test.ImpUtil", iu.getClass().toString());
		System.out.println("class ok");
	}
	
	
	@RepeatedTest(10)
	@DisplayName("Repeat")
	

	public void repeatedTest() {
		
		assertEquals(6, iu.repeatInt(), "not equal");
		
	}
	
	@Test
	@DisplayName("PRODUIT")
	void testProd() {
		//fail("Not yet implemented");
		//assertEquals(24,iu.prod(3, 8));
		assertEquals(24,iu.prod(3, 8),0.001);
	}

	@Test
	@DisplayName("DIVISION")
	void testDiv() {
		//fail("Not yet implemented");
		assertEquals(6,iu.div(6, 1));
	}

	@Test
	@DisplayName("ADDITION")
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(9, iu.add(6, 3));
	}

	@Test
	@DisplayName("SOUSTRACTION")
	void testSoustr() {
		//fail("Not yet implemented");
		assertEquals(9,iu.soustr(19, 10));
	}

	@Test
	@DisplayName("PGCD")
	void testPGCD() {
		//fail("Not yet implemented");
		assertEquals(15, iu.PGCD(15, 45));
	}

	@Test
	@DisplayName("FACTORIELLE")
	void testFact() {
		//fail("Not yet implemented");
		assertEquals(120,iu.Fact(5));
	}

	@Test
	@DisplayName("BINNAIRE")
	void testBin() {
		//fail("Not yet implemented");
		assertEquals("1111",iu.bin(15));
		
	}
	@Test
	@DisplayName("PARITE")
	//@Order(1)
	/*void test_exception() {
		Exception exception = assertThrows(ArithmeticException.class,() -> iu.div(1, 0));
		assertEquals("/ by zero", exception.getMessage());
		assertTrue(exception.getMessage().contains("zero"));
	}*/
	@ParameterizedTest
	@ValueSource(ints = {15, 236, 37})
	void testestPair(int arg) {
		assertTrue(iu.estPaire(arg), "not pair");
	}
	

	

}
