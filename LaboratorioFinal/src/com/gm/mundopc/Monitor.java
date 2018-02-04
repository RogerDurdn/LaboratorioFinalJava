package com.gm.mundopc;

public class Monitor {
	
	private int idMonitor;
	private String marca;
	private double tamano;
	private double precio;
	private static int contadorMonitores;
	
	
	
		public Monitor() {
			this.idMonitor = ++contadorMonitores;
		}
		public Monitor(String marca, double tamano,double precio) {
			this();
			this.marca = marca;
			this.tamano = tamano;
			this.precio = precio;
		}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public String getMarca() {
				return marca;
			}
			public void setTamano(double tamano) {
				this.tamano = tamano;
				
			}
			public double getTamano() {
				return tamano;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			public double getPrecio() {
				return precio;
			}
				
				public String toString() {
					return "\tid:"+idMonitor+" marca:"+marca+" tamano:"+tamano+"'"+" precio:$"+precio;
				}
}
