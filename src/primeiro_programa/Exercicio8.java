package primeiro_programa;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Area area = new Area();
		
		area.a = sc.nextDouble();
		area.b = sc.nextDouble();
		area.c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", area.triangulo());
		System.out.printf("CIRCULO: %.3f%n", area.circulo());
		System.out.printf("TAPEZIO: %.3f%n", area.trapezio());
		System.out.printf("QUADRADO: %.3f%n", area.quadrado());
		System.out.printf("RETANGULO: %.3f%n", area.retangulo());
		

		
		sc.close();

	}

}
