package untref.aydoo.graficador;

public class FuncionCuadratica {

	private float a;
	private float b;
	private float c;
	
	public FuncionCuadratica(float a, float b, float c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public float evaluarEn(float x) {
		return a*(x*x) + b*x + c;
	}
}
