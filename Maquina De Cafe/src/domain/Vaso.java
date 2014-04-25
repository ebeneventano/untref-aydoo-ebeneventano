public class Vaso {
	
	private Azucar azucarContenida;
	private Cafe cafeContenido;
	
	public void servir(){
		
	}
	
	public void ponerAzucar(Azucar azucar){
		azucarContenida = azucar;
	}
	
	public Azucar obtenerAzucar() {
		return azucarContenida;
	}
	
	public void ponerCafe(Cafe cafe){
		this.cafeContenido = cafe;
	}
	public Cafe obtenerCafe(){
		return this.cafeContenido;
	}

}