import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, metroQuadrado, area, valor;

		System.out.println("Entre com a altura e comprimento do terreno: ");
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = 200.00;

		area = largura * comprimento;
		valor = area * metroQuadrado;

		System.out.printf("�rea do Terreno �: %.2f metros� %n", area);
		System.out.printf("Valor do metro� � de:R$%.2f", valor);

		sc.close();
	}

}
