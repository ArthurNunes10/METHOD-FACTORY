package semPadrao;
import java.util.Scanner;

public class Quadrado{
	Scanner input = new Scanner(System.in);
	private float lado;

	public double getArea(int lados) {
		System.out.println("O pol�gono que possui "+lados+" lados � o quadrado!");
		System.out.println("Digite o tamanho da aresta:");
		this.lado = input.nextFloat();
		return lado*lado;
	}
}
