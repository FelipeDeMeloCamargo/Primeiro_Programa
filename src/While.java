import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {       //Executa em quanto certa regra for verdadeira, e quando for falsa ele sai fora e imprime
			soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
