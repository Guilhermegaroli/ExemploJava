package exemplo;

import java.util.Scanner;

public class ExemploAdicao {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
         
   //Operadores Matemáticos
	     
           //Adição
   System.out.println("Digite um valor");
   int valor1=sc.nextInt();
   System.out.println("Digite um valor");
   int valor2=sc.nextInt();
   int soma=valor1+valor2;
   
   System.out.println("O valor da soma dos 2 valores é: " +soma);
   
   sc.close();
   
 
   }

}
