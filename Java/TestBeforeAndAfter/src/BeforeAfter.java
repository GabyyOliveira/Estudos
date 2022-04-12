


//import org.junit.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfter {
	
	@BeforeClass
	//TODO METODO COM ANOTAÇÃO BEFORCLASS PRECISA TER O STATIC NA FRENTE
	static public void BeforeAll() {
		System.out.println("Before all");
	}
	
	@AfterClass
	static public void AfterAll() {
		System.out.println("After all");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

}
