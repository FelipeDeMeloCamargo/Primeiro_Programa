import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int codigo = sc.nextInt(), quantidade = sc.nextInt();
		double total;
		
		
		if (codigo == 1) {
			total =  quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo ==3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("TOTAL:R$%.2f", total);
		
		
		
		
		sc.close();

	}

}
