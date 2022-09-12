package exemplo;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu peso");
		float peso = sc.nextFloat();

		System.out.println("Digite sua ltura");
		float altura = sc.nextFloat();

		float imc = peso / (float) (Math.pow(altura, 2));

		if (imc <= 18.5) {
			System.out.println("Você está abaixo peso!");

		} else if (imc <= 24.9) {
			System.out.println("Você no peso ideal!");

		} else if (imc <= 29.9) {
            System.out.println("Você está acima do peso");
            
		} else if (imc <= 34.9) {
			System.out.println("Você está com obesidade grau 1");
		
		} else if (imc <= 39.9)	{
			System.out.println("Você está com obesidade grau 2");
			
		} else if (imc <= 40)	{
			System.out.println("Você está com obesidade grau 2 ou Mórbida");
			
		}	
			
			
		sc.close();
		
		

	}

}
