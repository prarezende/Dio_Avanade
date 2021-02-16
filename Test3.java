//Test3
import java.io.IOException;
import java.util.Scanner;

public class Test3{

	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		//instanciando e criando um objeto Scanner
		
		float a, b, consumo;
		
		System.out.printf("Informe a distancia percorrida(em km): ");
		a = ler.nextFloat();
		
		System.out.printf("Informe o consumo do combustivel(em litros): ");
		b = ler.nextFloat();
				
		consumo = (a/b);
		
		System.out.printf("\nConsumo total = %.3f km/l", consumo);
	}
}	
		