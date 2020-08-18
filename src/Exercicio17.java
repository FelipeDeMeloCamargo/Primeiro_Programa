import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 1234) {
			System.out.println("SENHA INVALIDA");
			senha = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO");
		
		sc.close();

	}

}
