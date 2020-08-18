import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i < N ;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double divisao;
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		
		
		sc.close();

	}

}
