import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		System.out.println("Informe a hora do dia");
		x = sc.nextInt();

		if (x < 12) { // se
			System.out.println("Bom dia!");
		} 
		else if (x < 18) {
				System.out.println("Boa tarde!");
		} 
		else {
				System.out.println("Boa noite!");
		}
		
		sc.close();

	}
}
