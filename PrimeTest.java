import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeTest {
	
	Prime pr = new Prime();

	@Test
	public void test2() {
		assertTrue(pr.isPrime(2));		
	}

	@Test
	public void test3() {
		assertTrue(pr.isPrime(3));		
	}
	
	@Test
	public void test4() {
		assertTrue(pr.isPrime(4));		
	}
	
	@Test
	public void test5() {
		assertTrue(pr.isPrime(5));		
	}
	
	@Test
	public void test6() {
		assertTrue(pr.isPrime(6));		
	}
}