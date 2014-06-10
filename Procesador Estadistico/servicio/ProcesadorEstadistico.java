package servicio;

import java.util.List;

import domain.Bicicleta;
import domain.Recorrido;

public interface ProcesadorEstadistico {

	List<Bicicleta> obtenerBicicletaUtilizadaMasVeces();

	List<Bicicleta> obtenerBicicletaUtilizadaMenosVeces();

	List<Recorrido> obtenerRecorridoMasRealizado();

	String obtenerTiempoPromedio(Bicicleta bicicleta);

}
