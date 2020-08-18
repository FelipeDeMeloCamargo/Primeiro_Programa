import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i < N; i = i + 1 ) {     // (inicio, executa só na primeira vez ; condição, repedir enquanto I for menor que N
			int x = sc.nextInt();				//Incremento, a cada vez que repetir o bloco de comando o i recebe i+1, um contador.
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		sc.close();

		
		
	}

}
