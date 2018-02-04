package com.gm.mundopc;

public class Teclado extends DispositivosEntrada {
	
	
	private int idTeclado;
	private static int contadorTeclados;
	
	
	public Teclado() {
		
	}
	public Teclado(String tipoEntrada,String marca,double precio) {
		super(tipoEntrada,marca,precio);
		this.idTeclado = ++contadorTeclados;
	}
	@Override
	
	public String toString() {
		return " \tid:"+idTeclado+" "+super.toString();
	}
	
	
	 
}
