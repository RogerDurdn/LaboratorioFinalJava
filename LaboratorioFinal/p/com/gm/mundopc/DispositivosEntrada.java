package com.gm.mundopc;

public class DispositivosEntrada {
	private String tipoEntrada;
	private String marca;
		
		public DispositivosEntrada() {
			
		}
	
		public DispositivosEntrada(String tipoEntrada, String marca) {
			this.tipoEntrada = tipoEntrada;
			this.marca = marca;
		}
			public void setTipoEntrada(String tipoEntrada) {
			this.tipoEntrada = tipoEntrada;
			
			}
			public String getTipoEntrada() {
			return tipoEntrada;
			}
			public void setEntrada(String entrada) {
			this.marca = entrada;
			}
			public String getEntrada() {
			return marca;
			}
			public String toString() {
			return "tipoEntrada:"+tipoEntrada+" entrada:"+marca; 
		}
}
