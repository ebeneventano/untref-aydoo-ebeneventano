package domain;

import java.util.Date;

public class Recorrido {
	
	private Estacion estacionOrigen;
	private Estacion estacionDestino;
	private Usuario usuario;
	private Bicicleta bicicleta;
	private Date fechaOrigen;
	private Date fechaDestino;
	private String tiempoUso;
	
	public void setEstacionOrigen(Estacion estacionOrigen) {
		this.estacionOrigen = estacionOrigen;
	}
	
	public Estacion getEstacionOrigen() {
		return estacionOrigen;
	}
	
	public void setEstacionDestino(Estacion estacionDestino) {
		this.estacionDestino = estacionDestino;
	}
	
	public Estacion getEstacionDestino() {
		return estacionDestino;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setFechaOrigen(Date fechaOrigen) {
		this.fechaOrigen = fechaOrigen;
	}

	public Date getFechaOrigen() {
		return fechaOrigen;
	}

	public void setFechaDestino(Date fechaDestino) {
		this.fechaDestino = fechaDestino;
	}

	public Date getFechaDestino() {
		return fechaDestino;
	}

	public void setTiempoUso(String tiempoUso) {
		this.tiempoUso = tiempoUso;
	}

	public String getTiempoUso() {
		return tiempoUso;
	}
}
