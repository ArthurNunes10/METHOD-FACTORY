package factory;
import java.util.Scanner;

public class Triangulo implements Poligono{
	Scanner input = new Scanner(System.in);
	private float altura;
	private float base;
	
	@Override
	public double getArea(int lados) {
		System.out.println("O pol�gono que possui "+lados+" lados � o tri�ngulo!:");
		System.out.println("Digite a altura (h):");
		this.altura = input.nextFloat();
		System.out.println("Digite a base (b):");
		this.base = input.nextFloat();
		return (base*altura)/2;
	}
}
