import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int codigo1,codigo2,numeropecas1,numeropecas2;
	double valor1,valor2,total;
	
	codigo1 = sc.nextInt();
	numeropecas1 = sc.nextInt();
	valor1 = sc.nextDouble();
	
	codigo2 = sc.nextInt();
	numeropecas2 = sc.nextInt();
	valor2 = sc.nextDouble();
	
	total = numeropecas1 * valor1 + numeropecas2 * valor2;
	
	System.out.printf("VALOR A PAGAR: %.2f", total);
	
	
	
	
	
	
	
	sc.close();

	}

}
