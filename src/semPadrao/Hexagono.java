package semPadrao;

import java.util.Scanner;

public class Hexagono{
	Scanner input = new Scanner(System.in);
	private double aresta;
	
	public double getArea(int lados) {
		System.out.println("O pol�gono que possui "+lados+"  lados � o hex�gono!");
		System.out.println("Digite o tamanho da aresta:");
		this.aresta = input.nextFloat();
		return (3*Math.sqrt(aresta)*Math.pow(aresta, 2))/2;
		}
}
