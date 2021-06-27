package factory;
import java.util.Scanner;

public class Quadrado implements Poligono{
	Scanner input = new Scanner(System.in);
	private float lado;

	@Override
	public double getArea(int lados) {
		System.out.println("O polígono que possui "+lados+" lados é o quadrado!");
		System.out.println("Digite o tamanho da aresta:");
		this.lado = input.nextFloat();
		return lado*lado;
	}
}
