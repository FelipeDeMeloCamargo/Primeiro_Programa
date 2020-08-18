import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, pi, raio;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * raio * raio;
		
		System.out.printf("A = %.4f",area);
	
		
		
		
		sc.close();

	}

}
