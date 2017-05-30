//EJERCICIO 4
package ejemplo;
import java.util.Scanner;

public class wuuMuchasCosas {
	private Scanner teclado;
	//private int f;
	private int d;
	
	public void wuu(){
		teclado=new Scanner(System.in);
		System.out.println("consgina: ");
		System.out.println("Escribir un programa que muestre la tabla de multiplicar del 5 (del 5 al 50).");
		System.out.print("ingrese el numero de la tabla de multiplicar que quiera ver :");
		d=teclado.nextInt();
		for(int a=1; a<=10; a++){
			
			System.out.println(d+"x"+a+"="+d*a);
		}
	}
	public static void main(String[] ar){
		wuuMuchasCosas ee1;
		ee1=new wuuMuchasCosas();
		ee1.wuu();
	}
}
