package exemplo;

import java.util.Scanner;

public class ExemploSubtracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 //Subtração
		   
		   System.out.println("Digite um valor");
		   int valor3=sc.nextInt();
		   System.out.println("Digite um valor");
		   int valor4=sc.nextInt();
		   int subtracao=valor3-valor4;

		   System.out.println("O valor da Subtração dos 2 valores é: " +subtracao);
		   
		sc.close();   
		   
	}

}
