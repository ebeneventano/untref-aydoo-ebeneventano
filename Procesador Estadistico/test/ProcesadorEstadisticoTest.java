package test;

import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

import domain.Bicicleta;
import domain.Recorrido;

import servicio.ProcesadorEstadistico;
import servicio.ProcesadorEstadisticoImpl;

public class ProcesadorEstadisticoTest {
	
	private ProcesadorEstadistico procesador = new ProcesadorEstadisticoImpl();
	
	@Test
	public void testBicicletaUtilizadaMasVeces(){
		
		List<Bicicleta> bicicletasMasUsadas = procesador.obtenerBicicletaUtilizadaMasVeces();
		Assert.assertEquals("419", bicicletasMasUsadas.get(0).getId());
	}
	
	@Test
	public void testBicicletaUtilizadaMenosVeces(){
		List<Bicicleta> bicicletasMenosUsadas = procesador.obtenerBicicletaUtilizadaMenosVeces();
		Assert.assertEquals("452", bicicletasMenosUsadas.get(0).getId());
		Assert.assertEquals("464", bicicletasMenosUsadas.get(1).getId());
	}
	
	@Test
	public void testRecorridoMasRealizado(){
		List<Recorrido> recorridosMasRealizados = procesador.obtenerRecorridoMasRealizado();
		
		String origenId = recorridosMasRealizados.get(0).getEstacionOrigen().getId();
		String destinoId = recorridosMasRealizados.get(0).getEstacionDestino().getId();

		Assert.assertEquals(5, origenId);
		Assert.assertEquals(3, destinoId);
		
	}
	
	@Test
	public void testTiempoPromedioDeUso(){
		Bicicleta bicicleta = new Bicicleta();
		String tiempoPromedio = procesador.obtenerTiempoPromedio(bicicleta);
	}
}
