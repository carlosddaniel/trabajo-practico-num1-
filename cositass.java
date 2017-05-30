//EJERCICIO 3
package ejemplo;
import java.util.Scanner;

public class cositass {

	private Scanner teclado;
	private int[] anne;
	private int b;
	
	public void stard(){
		teclado=new Scanner(System.in);
		System.out.println("consigna: ");
		System.out.println("Desarrollar un programa que permita cargar 10 números enteros y luego nos informe cuántos valores fueron pares y cuántos impares");
		anne=new int[10];
		for(int f=0; f<=9; f++){
			System.out.print("ingrese los numeros:");
			anne[f]=teclado.nextInt();
						
		}
		
	}
	public void prinnt(){
		for (int a=0; a<=9; a++){
		b= anne[a]%2;
		if(b == 0){
			System.out.println(anne[a]+" es un numero par");
		}else{
			System.out.println(anne[a]+" es un numero inpar");
		}
		}
	}
	
	public static void main(String[] ar){
		cositass ss1;
		ss1=new  cositass();
		ss1.stard();
		ss1.prinnt();
				
	}
}
