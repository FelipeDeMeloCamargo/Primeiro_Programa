import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt(), horas = sc.nextInt();
		double valorHora = sc.nextDouble(), salario;
		
		salario = horas * valorHora;
		
		System.out.println("NUMERO: " + numero);
		System.out.printf("Salário = R$%.2f", salario);
		
		sc.close();

	}

}
