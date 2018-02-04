package com.gm.mundopc;

public class DispositivosEntrada {
	private String tipoEntrada;
	private String marca;
	private double precio;
		
		public DispositivosEntrada() {
			
		}
	
		public DispositivosEntrada(String tipoEntrada, String marca,double precio) {
			this.tipoEntrada = tipoEntrada;
			this.marca = marca;
			this.precio = precio;
		}
			public void setTipoEntrada(String tipoEntrada) {
			this.tipoEntrada = tipoEntrada;
			
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			public double getPrecio() {
				return precio;
			}
			public String getTipoEntrada() {
			return tipoEntrada;
			}
			public void setEntrada(String marca) {
			this.marca = marca;
			}
			public String getEntrada() {
			return marca;
			}
			public String toString() {
			return " \tmarca:"+marca+" \ttipoEntrada:"+tipoEntrada+" \tprecio:"+precio ; 
		}
}
