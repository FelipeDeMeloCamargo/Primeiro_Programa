import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos-100) * 2.0;
		}
		System.out.printf("Valor da conta é: R$ %.2f%n", conta);

	}

}
//Operadores a += b  é igual " a = a + b"
//Operadores a -= b  é igual " a = a - b"
//Operadores a *= b  é igual " a = a * b"
//Operadores a /= b  é igual " a = a / b"
//Operadores a %= b  é igual " a = a % b"
