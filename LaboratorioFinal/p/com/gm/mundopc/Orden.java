package com.gm.mundopc;

public class Orden {
	private int idOrden;
	private Computadora [] computadoras;
	private static int conOrdenes;
	private int conComputadoras;
	private int maxComputadoras;
	
		private Orden() {
			this.idOrden = ++conOrdenes;
		}
		public Orden() {
			
		}
		
}

