import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) {
			System.out.println("FORA DO INTERVALO");
		}
		else if (valor <= 25) {
			System.out.println("INTERVALO [0,25]");
		}
		else if (valor <= 50) {
			System.out.println("INTERVALO [25,50]");
		}
		else {
			System.out.println("INTERVALO [75,100]");
		}
		
		
		sc.close();
	}

}
