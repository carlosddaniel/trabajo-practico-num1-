package ejemplo;
//EJERCICIO 6
import java.util.Scanner;

public class naani {
	private Scanner teclado;
	private String nom;
	private int dinerico;
		
	public void gear1(){
		teclado=new Scanner(System.in);
		System.out.println("consigna: ");
		System.out.println("Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. Confeccionar los métodos para la carga, otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000).");
		System.out.println("ingrese los datos del empleado: ");
		
		System.out.print("nombre: ");
		nom=teclado.next();
		System.out.print("sueldo: ");
		dinerico=teclado.nextInt();
		
		}
	public void imprimewe(){
		if( dinerico >= 3000 ){
			System.out.println("datos del empleado: ");
			System.out.println("nombre: "+nom);
			System.out.println("sueldo: "+dinerico);
			System.out.print("paga el impuesto we >:v");
			}else{
				System.out.println("datos del empleado: ");
				System.out.println("nombre: "+nom);
				System.out.println("sueldo: "+dinerico);
				System.out.print("tines suerte de no pagar impuestos we e.e");
				
			}
	}
	
	public static void main(String[] ar){
		naani anne;
		anne=new naani();
		anne.gear1();
		anne.imprimewe();
	}
}	



