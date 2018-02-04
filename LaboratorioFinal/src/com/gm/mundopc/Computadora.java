package com.gm.mundopc;

public class Computadora {
	
	private int idC;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int cCom;
	private double precio;
	
		public Computadora() {
			this.idC = ++cCom;
		}
		public Computadora(String nombre,Monitor monitor, Teclado teclado, Raton raton) {
			this();
			this.nombre = nombre;
			this.monitor = monitor;
			this.teclado = teclado;
			this.raton = raton;
		}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getNombre() {
				return nombre;
			}
			public Monitor getMonitor() {
			     return monitor;
			}
			public Teclado getTeclado() {
				return teclado;
				
			}
			public Raton getRaton() {
				return raton;
			}
			public double getPrecio() {
				double a = monitor.getPrecio();
				double b = teclado.getPrecio();
				double c = raton.getPrecio();
				double total = a+b+c;
				return total;
			}
			
				@Override
				public String toString() {
					return "id:"+idC+" nombre:"+nombre+"\n"+
							"monitor:"+monitor+"\nteclado:"+
							teclado+"\nraton:"+raton;
				}
}
