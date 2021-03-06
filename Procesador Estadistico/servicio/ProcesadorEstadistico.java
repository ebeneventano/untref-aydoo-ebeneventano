package servicio;

import java.nio.file.Path;
import java.util.List;

import dominio.Bicicleta;
import dominio.Recorrido;

public interface ProcesadorEstadistico {

	List<Bicicleta> obtenerBicicletaUtilizadaMasVeces();
	List<Bicicleta> obtenerBicicletaUtilizadaMenosVeces();
	List<Recorrido> obtenerRecorridoMasRealizado();
	String obtenerTiempoPromedio(Bicicleta bicicleta);
	void comenzarAEscuchar(Path folder);

}
