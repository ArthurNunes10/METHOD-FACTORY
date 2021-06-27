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
		   demais instâncias
		   .....
		   .....
		   .....
		   .....
		  */
		System.out.println("Digite o nome de lados do polígono:");
		int lados = input.nextInt();
		
		if(lados==3) {
			System.out.println("A area é "+triang.getArea(lados));
		}
			
		else if(lados==4) {
			System.out.println("A area é "+quad.getArea(lados));
		}
			
		else {
			System.out.println("A area é "+hex.getArea(lados));	
		}
	}
}
