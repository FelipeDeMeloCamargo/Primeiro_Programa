import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt(), fim = sc.nextInt();
		
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("A PARTIDA DUROU " + duracao + " HORAS");
		
		
		sc.close();

	}

}
