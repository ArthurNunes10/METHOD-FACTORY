package factory;

public class AreaFactory {
	public static Poligono calcularArea(int lados) {
		if(lados==3)
			return new Triangulo();
		else if(lados==4)
			return new Quadrado();
		else
		return new Hexagono();
	}
}
