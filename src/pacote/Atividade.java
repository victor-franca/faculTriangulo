package pacote;

import java.util.Scanner;

public class Atividade {
	
	public static void main (String []args ) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o 1 lado do triangulo");
		a=sc.nextDouble();
		System.out.println("Informe o 2 lado do triangulo");
		b=sc.nextDouble();
		System.out.println("Informe o 3 lado do triangulo");
		c=sc.nextDouble();
		
		if (b-c<a && a<b+c && a-c<b && b<a+c && a-b<c && c<a+b) {
			System.out.println("È triângulo!");
			if (a==b && b==c && a==c) {
				System.out.println("Triângulo equilátero");
			}
			else if (a==b || b==c || c==a) {
				System.out.println("Triângulo isóceles");
			}
			else {
				System.out.println("Triângulo Escaleno");
			}
		}	
		
		else {
			System.out.println("Nâo é triângulo!");
		}
	}

}
