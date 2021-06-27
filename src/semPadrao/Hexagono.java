package semPadrao;

import java.util.Scanner;

public class Hexagono{
	Scanner input = new Scanner(System.in);
	private double aresta;
	
	public double getArea(int lados) {
		System.out.println("O polígono que possui "+lados+"  lados é o hexágono!");
		System.out.println("Digite o tamanho da aresta:");
		this.aresta = input.nextFloat();
		return (3*Math.sqrt(aresta)*Math.pow(aresta, 2))/2;
		}
}
