
public class MaquinaDeCafe {
	
	private Vaso vaso;
	private Cafetera cafetera = new Cafetera();

	public Vaso getVaso() {
		return vaso;
	}

	public void setVaso(Vaso vaso) {
		this.vaso = vaso;
	}

	public Vaso hacerCafe(Azucar azucar, Cafe cafe) throws InvalidCafeException {
		vaso.ponerAzucar(azucar);
		cafetera.dameCafe(cafe.getCantidadCafe());
		vaso.ponerCafe(cafe);
		
		return vaso;
	}

	public void setCafetera(Cafetera cafetera) {
		this.cafetera = cafetera;
	}

	public Cafetera getCafetera() {
		return cafetera;
	}

}
