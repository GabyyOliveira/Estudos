import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class CarTest {
	
	@BeforeClass
	static public void beforeAll() {
		
	}

	@Test
	void test() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10,c.getVelocidade());
		c.acelerar();
		c.acelerar();
		assertEquals(30,c.getVelocidade());
		c.frea();
		assertEquals(15,c.getVelocidade());
	}

}
