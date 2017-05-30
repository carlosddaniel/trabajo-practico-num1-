package ejemplo;
import java.util.Scanner;

public class ejercicio2 {
	private Scanner teclado;
	private int num1;
	private int num2;
	public void start(){
		teclado=new Scanner(System.in);
		System.out.println("consigna: ");
		System.out.println("Se ingresa por teclado un número positivo, mostrar un mensaje indicando si el número tiene uno, dos dígitos o más.");
		System.out.println("ingrese el numero a identificar: ");
		num1=teclado.nextInt();
		if(num1>=1){
			while(num1>=1){
				num1=num1/10;
				num2=num2+1;
			}
		}else{
			while(num1<=-1){
				num1=num1/10;
				num2=num2+1;
			}
		}
			
		
		System.out.print("tiene :"+num2+" dijitos");
	}
	public static void main(String[] ar){
		ejercicio2 dad;
		dad=new ejercicio2();
		dad.start();
		
	}
	
}
