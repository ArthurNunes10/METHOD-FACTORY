package semPadrao;

import java.util.Scanner;

public class Principal {
	private static Scanner input;

	public static void main (String[] args) {
		input = new Scanner(System.in);
		Triangulo triang = new Triangulo();
		Quadrado quad = new Quadrado();
		Hexagono hex = new Hexagono();
		 /*
		   demais inst�ncias
		   .....
		   .....
		   .....
		   .....
		  */
		System.out.println("Digite o nome de lados do pol�gono:");
		int lados = input.nextInt();
		
		if(lados==3) {
			System.out.println("A area � "+triang.getArea(lados));
		}
			
		else if(lados==4) {
			System.out.println("A area � "+quad.getArea(lados));
		}
			
		else {
			System.out.println("A area � "+hex.getArea(lados));	
		}
	}
}
