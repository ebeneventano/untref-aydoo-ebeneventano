package untref.aydoo.graficador;

public class FuncionLineal {
	
	private float a;
	private float b;

	public FuncionLineal(float a, float b) {
		this.a = a;
		this.b = b;
	}

	public float evaluarEn(float x) {
		return a*x + b;
	}

}
