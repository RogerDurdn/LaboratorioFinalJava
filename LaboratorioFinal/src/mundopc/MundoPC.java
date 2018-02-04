package mundopc;
import com.gm.mundopc.*;
import javax.swing.*;
public class MundoPC {
	
	public static void main(String[] args) {
		
		Monitor [] lMonitores;
		lMonitores = new Monitor[11];
		
		lMonitores [0] = new Monitor("No requerido",0,0);
		lMonitores [1] = new Monitor("sony",15,1500);
		lMonitores [2] = new Monitor("daewo",12,700);
		lMonitores [3] = new Monitor("panasonic",23,800);
		lMonitores [4] = new Monitor("sony",23,900);
		lMonitores [5] = new Monitor("daewo",15,1000);
		lMonitores [6] = new Monitor("panasonic",30,1500);
		lMonitores [7] = new Monitor("benq",40,4000);
		lMonitores [8] = new Monitor("sony",32,2400);
		lMonitores [9] = new Monitor("benq",23,4000);
		lMonitores [10] = new Monitor("ekt",32,2700.33);
		
		Teclado [] lTeclado;
		lTeclado = new Teclado [7];
		
		lTeclado [0] = new Teclado("","No requerido",0);
		lTeclado [1] = new Teclado("usb","logitech",400);
		lTeclado [2] = new Teclado("inalambrico","logitech",150);
		lTeclado [3] = new Teclado("inalambrico","razer",240);
		lTeclado [4] = new Teclado("usb","razer",350);
		lTeclado [5] = new Teclado("usb","ekt",500);
		lTeclado [6] = new Teclado("usb","vorago",300);
		
		Raton [] lRaton;
		lRaton = new Raton[6];
		
		lRaton [0] = new Raton ("","No requerido",0);
		lRaton [1] = new Raton ("usb","razer",340);
		lRaton [2] = new Raton ("usb","logitech",333);
		lRaton [3] = new Raton ("inalambirco","logitech",1500);
		lRaton [4] = new Raton ("usb","vorago",50);
		lRaton [5] = new Raton ("usb","panasonic",90.99);
		
		JOptionPane.showMessageDialog(null,"Compus Locas","Arma tu compu!",JOptionPane.INFORMATION_MESSAGE);
		
		String d1= JOptionPane.showInputDialog("Quieres armar una computadora?si,no");
		
		if(d1.equals("si")) {
			
			String d5 ="";
			Orden o1 = new Orden();
			do {
				String n= JOptionPane.showInputDialog("como se llamara la compu");
			int a =0;
				String d2= JOptionPane.showInputDialog("Quieres comprar un monitor?si,no");
				
					if(d2.equals("si")) {
				
						JOptionPane.showMessageDialog(null,"Monitores","Elige tu monitor",JOptionPane.INFORMATION_MESSAGE);
			
						System.out.println("Monitores Disponibles");
							for(int i=1;i<lMonitores.length;i++) {
									
								System.out.println(lMonitores[i]+" \n#"+i);
		                    }
									a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del monitor deseado."));
				     }
		         
				
					String d3= JOptionPane.showInputDialog("Quieres comprar un Teclado?si,no");
			int b=0;		
			if(d3.equals("si")) {
		
			JOptionPane.showMessageDialog(null,"Teclados","Elige tu teclado",JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Teclados Disponibles");
				for(int i=1;i<lTeclado.length;i++) {
					System.out.println(lTeclado[i]+" \n#"+i);
				}
					b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del teclado deseado."));
		}
			String d4= JOptionPane.showInputDialog("Quieres comprar un Raton?si,no");
			int c = 0 ;
		   if(d4.equals("si")) {
			   JOptionPane.showMessageDialog(null,"Ratones","Elige tu raton",JOptionPane.INFORMATION_MESSAGE);
			   		System.out.println("Ratones Disponibles");
			   			for(int i=1;i<lRaton.length;i++) {
			   					System.out.println(lRaton[i]+" \n#"+i);
		}
		 c = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del raton deseado."));
		}
		Computadora c1 = new Computadora(n,lMonitores[a],lTeclado[b],lRaton[c]);
		o1.agregarComputadoras(c1);
		
		d5= JOptionPane.showInputDialog("Quieres comprar otra computadora?si,no");
		}while(d5.equals("si"));
		o1.emostrarOrden();
	}
		System.out.println("Adios!!");

	}
}
