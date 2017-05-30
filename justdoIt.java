//EJERCICIO 5
package ejemplo;
import java.util.Scanner;

public class justdoIt {
private Scanner teclado;
private int anne;
private int vp;
	public void ini(){
		System.out.println("consigna: ");
		System.out.println("Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.");
		do{
			teclado=new Scanner(System.in);
			System.out.print("ingrese los numeros a acumular:");
			anne=teclado.nextInt();
			if (anne!=999){
			
				vp= vp + anne;
				
			}else{
				System.out.print("suma de numeros finalizada :P ");
			}
		
			
		}while(anne!=999);
		System.out.println("total de los numeros ingresados: "+vp);
	} 
	public static void main(String[] ar){
		justdoIt it;
		it=new justdoIt();
		it.ini();
		
	}
}
