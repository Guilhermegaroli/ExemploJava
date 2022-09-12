package exemplo;

import java.util.Scanner;

public class ExemploMultiplicacao {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 		
		//Multiplicação
		   System.out.println("Digite um valor");
		   int valor5=sc.nextInt();
		   System.out.println("Digite um valor");
		   int valor6=sc.nextInt();
		   int multiplicacao=valor5*valor6;
		   
		   System.out.println("O valor da Multiplicação dos 2 valores é: " +multiplicacao);
		   
	sc.close();
	
	}

}
