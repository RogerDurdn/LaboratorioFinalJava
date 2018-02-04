package com.gm.mundopc;

public class Raton extends DispositivosEntrada {
	
	private int idRaton;
	private static int contadorRaton;
	
	public Raton() {
		
	}
	public Raton(String tipoEntrada,String marca) {
		super(tipoEntrada,marca);
		this.idRaton = ++contadorRaton;
	}
	@Override
	public String toString() {
		return super.toString()+" id:"+idRaton;
	}

}
