package exemplo;

import java.util.Scanner;

public class ExemploDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Divisao
		   System.out.println("Digite um valor");
		   float valor7=sc.nextFloat();
		   System.out.println("Digite um valor");
		   float valor8=sc.nextFloat();
		   float divisao=valor7/valor8;
		   
		   System.out.println("O valor da Divisao dos 2 valores é: " +divisao);
		   
		   sc.close();	

	}

}
