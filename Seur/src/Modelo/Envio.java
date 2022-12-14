package Modelo;

import Vista.VentanaEnvios;

public class Envio 
{
	private String ciudadOrigen, ciudadDestino;
	private boolean origenNacional, destinoNacional;
	 private String tipoEnvio;
	 private int peso;
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	public String getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	public boolean isOrigenNacional() {
		return origenNacional;
	}
	public void setOrigenNacional(boolean origenNacional) {
		this.origenNacional = origenNacional;
	}
	public boolean isDestinoNacional() {
		return destinoNacional;
	}
	public void setDestinoNacional(boolean destinoNacional) {
		this.destinoNacional = destinoNacional;
	}
	public String getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Envio(String ciudadOrigen, String ciudadDestino, boolean origenNacional, boolean destinoNacional,
			String tipoEnvio, int peso) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.origenNacional = origenNacional;
		this.destinoNacional = destinoNacional;
		this.tipoEnvio = tipoEnvio;
		this.peso = peso;
	}
	
	
	public Envio() {
		super();
	}
	@Override
	public String toString() {
		return "Envio [ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", origenNacional="
				+ origenNacional + ", destinoNacional=" + destinoNacional + ", tipoEnvio=" + tipoEnvio + ", peso="
				+ peso + "]";
	}
	
	public double calculaImporte()
	{
		double precio = 0;
		double precioPeso = 0;
		if ((origenNacional == true) && (destinoNacional == true))
		{
			precio = 4;
		}
		else
		{
			precio = 7;
		}
		
		if (this.tipoEnvio.equals("Paq 10 - Antes de las 10:00"))
		{
			precio = precio + 5;
		}
		
		precioPeso = peso * 0.1;
		precio = precio + precioPeso;
		return precio;
	}
	 

}
