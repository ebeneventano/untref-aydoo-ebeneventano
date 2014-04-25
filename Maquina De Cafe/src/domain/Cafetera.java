public class Cafetera {
	private Cafe cafeContenido;

	public void setCafe(Cafe cafe) {
		this.cafeContenido = cafe;
	}

	public Cafe getCafe() {
		return cafeContenido;
	}
	
	public Cafe dameCafe(int cantidadASacar) throws InvalidCafeException {
		Cafe cafe = new Cafe(cantidadASacar);
		cafeContenido.restarCantidad(cantidadASacar);
		return cafe;
	}
}