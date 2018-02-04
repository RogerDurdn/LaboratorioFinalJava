package com.gm.mundopc;

public class Raton extends DispositivosEntrada {
	
	private int idRaton;
	private static int contadorRaton;
	
	public Raton() {
		
	}
	public Raton(String tipoEntrada,String marca,double precio) {
		super(tipoEntrada,marca,precio);
		this.idRaton = ++contadorRaton;
	}
	@Override
	public String toString() {
		return " \t\tid:"+idRaton+" "+super.toString();
	}

}
