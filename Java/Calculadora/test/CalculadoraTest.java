import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calc = new Calculadora();

	@Test
	void soma() {
		int resultado = calc.soma(3, 4);
		Assertions.assertEquals(7, resultado);
	}
	
	@Test
	void divisao() {
		int result = calc.divisao(8,2);
		Assertions.assertEquals(4, result);
	}
	
	
	

}
