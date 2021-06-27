package factory;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de lados do pol�gono:");
		int lados = input.nextInt();
		
		Poligono poligono = AreaFactory.calcularArea(lados);	
		double valorArea = poligono.getArea(lados);
		
		System.out.println("O valor da �rea � "+ valorArea);
		input.close();
	}
}
