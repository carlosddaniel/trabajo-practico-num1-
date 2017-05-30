package ejemplo;
import java.util.Scanner;

public class ejercicio1 {
private Scanner teclado;
private int ent;
private int costo;
private int si;
private int no;
	public void start (){
		teclado=new Scanner(System.in);
		System.out.println("consigna: ");
		System.out.println("Desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.");
		System.out.print("ingrese el valor del producto que desee comprar:");
		costo=teclado.nextInt();
		System.out.print("ingrese cuando dinero tiene:");
		ent=teclado.nextInt();
		if(ent>=costo){
			si=ent-costo;
			System.out.println("su buelto es de: "+si);
			
		}else{
			no=ent-costo;
			System.out.print("usted debe "+no);
			
		}
	}
	public static void main(String[] ar){
		ejercicio1 dad;
		dad=new ejercicio1();
		dad.start();
	
	}

}
