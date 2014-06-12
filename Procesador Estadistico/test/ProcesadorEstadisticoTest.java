package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import servicio.ProcesadorEstadistico;
import servicio.ProcesadorEstadisticoImpl;
import dominio.Bicicleta;
import dominio.Recorrido;

public class ProcesadorEstadisticoTest {
	
	private ProcesadorEstadistico procesador = new ProcesadorEstadisticoImpl();
	
	@Before
	public void comenzarAEscucharNuevoCSVFileEnDirectorio(){
		Path folder = Paths.get(System.getProperty("user.home"));
		procesador.comenzarAEscuchar(folder);
	}
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
		
		String origenId = recorridosMasRealizados.get(0).getTrayectoria().getEstacionOrigen().getId();
		String destinoId = recorridosMasRealizados.get(0).getTrayectoria().getEstacionDestino().getId();

		Assert.assertEquals(5, origenId);
		Assert.assertEquals(3, destinoId);
		
	}
	
	@Test
	public void testTiempoPromedioDeUso(){
	}
}
