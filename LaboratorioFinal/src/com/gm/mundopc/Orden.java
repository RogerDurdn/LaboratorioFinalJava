package com.gm.mundopc;

public class Orden {
	private int idOrden;
	private Computadora [] computadoras;
	private static int conOrdenes;
	private int conComputadoras;
	private final static int maxComputadoras = 5;
	
		public Orden() {
			this.idOrden = ++conOrdenes;
			computadoras = new Computadora[maxComputadoras];
		}
		public void agregarComputadoras(Computadora computadora) {
			
			if(conComputadoras<maxComputadoras) {
				computadoras[conComputadoras++] = computadora;
			}
			else {
				System.out.println("A llegado al maximo de computadoras por pedido.!!");
			}
			
		}
		public double cuentaTotal() {
			double total = 0;
			for(int i=0;i<conComputadoras;i++) {
				total += computadoras[i].getPrecio();
			}
			return total;
		}
		public void emostrarOrden() {
			System.out.println("Orden: #"+idOrden);
			System.out.println("Computadoras de la orden:"+idOrden);
			for(int i=0; i < conComputadoras; i++) {
				System.out.println(computadoras[i]);
			}
			System.out.println("Costo total:$"+cuentaTotal());
		}
		
}

