package untref.aydoo.graficador.tests;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionLineal;

public class FuncionLinealTests {

	@Test
	public void evaluarEn4DeberiaRetornar11CuandoAEs2YBEs3() {

		float a = 2.0f;
		float b = 3.0f;
		float x = 4.0f;
		float resultado = 11.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}

}
