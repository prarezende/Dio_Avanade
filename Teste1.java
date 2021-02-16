//Teste1 qtde de pimentoes separados por espaço
import java.util.Scanner;

public class Teste1 { 
	public static void main(String args[]){
	
	Scanner ler = new Scanner(System.in);
	int a, b;
	
	System.out.printf("Informe a qtde de pimentoes amarelos e vermelhos: ");
	a = ler.nextInt();
	b = ler.nextInt();
	
	//System.out.printf("Informe a qtde de pimentoes vermelhos: ");
	//b = ler.nextInt();
	
	System.out.printf("\n X = %d", (a+b));
	
	}
}
