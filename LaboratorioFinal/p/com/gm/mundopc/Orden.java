package com.gm.mundopc;

public class Orden {
	private int idOrden;
	private Computadora [] computadoras;
	private static int conOrdenes;
	private int conComputadoras;
	private int maxComputadoras = 5;
	
		private Orden() {
			this.idOrden = ++conOrdenes;
		}
		public void agregarComputadoras(Computadora computadora) {
			if(conComputadoras<maxComputadoras) {
				computadoras[conComputadoras++] = computadora;
			}
			else {
				System.out.println("A llegado al maximo de computadoras por pedido.!!");
			}
			
		}
		public void emostrarOrden() {
			System.out.println("Orden: #"+idOrden);
			System.out.println("Computadoras de la orden:");
			for(int i=0; i < conComputadoras; i++) {
				System.out.println(computadoras[i]);
			}
		}
		
}

