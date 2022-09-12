//Comentario Inline - Em linha

/*Comentário Multelinha*/
/*1) Solicite um valor do teclado e exiba o seu sucessor.*/

/**
 * JavaDoc
 * @author Thayna
 */
package exemplo;

import java.util.Scanner;

public class Exemplo06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero=sc.nextInt();
		int antecessor=numero+1;
				
				System.out.println("O sucessor de " +numero+ " é : " +antecessor);
		sc.close();
	}
}