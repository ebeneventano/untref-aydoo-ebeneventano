
public class Cafe {
	
	private int cantidadCafeCm3;
	
	public Cafe (int cantidad){
		this.cantidadCafeCm3 = cantidad;
	}
	
	public int getCantidadCafe(){
		return this.cantidadCafeCm3;
	}
	
	public void restarCantidad(int cantidadASacar) throws InvalidCafeException{
	
		if(cantidadCafeCm3 < cantidadASacar){
			throw new InvalidCafeException("No posee la cantidad de cafe suficiente");
		}else{
			this.cantidadCafeCm3 = cantidadCafeCm3 - cantidadASacar;
		}
	}

}
