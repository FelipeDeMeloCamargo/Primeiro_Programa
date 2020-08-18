package primeiro_programa;

public class Area {
	public double a,b,c;

	public double triangulo() {
		return (a * c) /2;
	}
	public double circulo() {
		return c * c * 3.14159;
	}
	public double trapezio() {
		return ((a + b)*c) /2;
	}
	public double quadrado() {
		return b * b;
	}
	public double retangulo() {
		return a * b;
	}
}