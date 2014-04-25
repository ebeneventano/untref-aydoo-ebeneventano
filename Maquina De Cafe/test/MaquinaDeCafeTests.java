import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class MaquinaDeCafeTests {

	@Test
	public void testVaso() {
		Vaso vaso = new Vaso();

		vaso.servir();
	}

	@Test
	public void testPonerAzucarAlVaso() {
		Vaso vaso = new Vaso();
		Azucar azucar = new Azucar(2);

		vaso.ponerAzucar(azucar);
	}

	@Test
	public void testCafetera() throws InvalidCafeException {

		Cafetera cafetera = new Cafetera();
		
		Cafe cafe = new Cafe(3000);
		cafetera.setCafe(cafe);
		
		Cafe cafeSacado = cafetera.dameCafe(250);
		
		Assume.assumeNotNull(cafetera);
		Assume.assumeNotNull(cafe);
		
		Assert.assertEquals(250, cafeSacado.getCantidadCafe());
		Assert.assertEquals(2750, cafetera.getCafe().getCantidadCafe());
	}

	@Test
	public void testHacerCafe() throws InvalidCafeException {
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
		Vaso vasoAdentro = new Vaso();
		Cafe cafeContenido = new Cafe(3000);
		
		maquinaDeCafe.getCafetera().setCafe(cafeContenido);
		maquinaDeCafe.setVaso(vasoAdentro);

		Vaso vaso = maquinaDeCafe.hacerCafe(new Azucar(2), new Cafe(250));
		
		Assume.assumeNotNull(vaso);
		
		Assert.assertNotNull(vaso.obtenerCafe());
	}

	@Test
	public void testHacerBebidaConAzucar() throws InvalidCafeException {
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
		Vaso vasoAdentro = new Vaso();
		
		maquinaDeCafe.getCafetera().setCafe(new Cafe(3000));
		maquinaDeCafe.setVaso(vasoAdentro);
		
		Vaso vaso = maquinaDeCafe.hacerCafe(new Azucar(2),new Cafe(250));
		
		Assume.assumeNotNull(vaso);
		
		Assert.assertNotNull(vaso.obtenerAzucar());
		Assert.assertEquals(2750, maquinaDeCafe.getCafetera().getCafe().getCantidadCafe());
	}
	
	@Test(expected = InvalidCafeException.class)
	public void testCantidadARetirarInvalida() throws InvalidCafeException{
		Cafetera cafetera = new Cafetera();
		
		Cafe cafe = new Cafe(3000);
		cafetera.setCafe(cafe);
		
		cafetera.dameCafe(3400);
		
		Assume.assumeNotNull(cafetera);
		Assume.assumeNotNull(cafe);
	}
}
