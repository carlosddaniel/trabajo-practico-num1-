//EJERCICIO 7
package ejemplo;
import java.util.Scanner;

public class khejem {
	private Scanner teclado;
	private int numerito1;
	private int numerito2;
	private int suma;
	private int resta;
	private int multiplicacion;
	private int division;
	
	
	public void in(){
		teclado=new Scanner(System.in);
		System.out.println("consigna: ");
		System.out.println("Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, resta, multiplicación y división, cada unaen un método, imprimir dichos resultados.");
		System.out.print("ingrese los numeros a operar:");
		numerito1=teclado.nextInt();
		numerito2=teclado.nextInt();
		
	}
	public void sum(){
		
		suma=numerito1+numerito2;
		System.out.println(numerito1+"+"+numerito2+"="+suma);
				
	}
	public void res(){
		
		resta=numerito1-numerito2;
		System.out.println(numerito1+"-"+numerito2+"="+resta);
				
	}
	public void mul(){
		
		multiplicacion=numerito1*numerito2;
		System.out.println(numerito1+"*"+numerito2+"="+multiplicacion);
				
	}
	public void div(){
	
	division=numerito1/numerito2;
	System.out.println(numerito1+"/"+numerito2+"="+division);
			
	}

	public static void main(String[] ar){
		khejem mss;
		mss=new khejem();
		mss.in();
		mss.sum();
		mss.res();
		mss.mul();
		mss.div();
	}
}
