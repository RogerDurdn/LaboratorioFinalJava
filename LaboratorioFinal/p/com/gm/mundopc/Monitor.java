package com.gm.mundopc;

public class Monitor {
	
	private int idMonitor;
	private String marca;
	private double tamano;
	private static int contadorMonitores;
	
		public Monitor() {
			this.idMonitor = ++contadorMonitores;
		}
		public Monitor(String marca, double tamano) {
			this.marca = marca;
			this.tamano = tamano;
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
				
				public String toString() {
					return "marca:"+marca+" tamano:"+tamano;
				}
}
