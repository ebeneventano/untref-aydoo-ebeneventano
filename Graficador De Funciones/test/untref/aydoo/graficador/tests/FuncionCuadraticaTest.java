
public class FuncionCuadraticaTest {
	
	@Test
	public void evualuarEn0DeberiaDarC(){
		float a = 2.0f;
		float b = 3.0f;
		float c = 4.0f
		float x = 0.0f;
		float resultado = c;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b, c);
		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);
	}
	
	@Test
	public void evualuarEn1DeberiaDar9CuandoAIgual2BIgual3yCIgual4(){
		float a = 2.0f;
		float b = 3.0f;
		float c = 4.0f
		float x = 1.0f;
		float resultado = 9.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b, c);
		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);
	}
	
	@Test
	public void evualuarEnMenos1DeberiaDar3CuandoAIgual2BIgual3yCIgual4(){
		float a = 2.0f;
		float b = 3.0f;
		float c = 4.0f
		float x = -1.0f;
		float resultado = 3.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b, c);
		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);
	}

}
