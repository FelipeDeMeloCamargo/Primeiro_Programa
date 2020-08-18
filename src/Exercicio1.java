import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		//imprimindo
		//%f = ponto flutuante ou valor quebrado com .
		//%d = inteiro
		//%s = texto
		//%n = Quebra de linha
		
		System.out.println("Produtos:");
		System.out.printf("%s custa o preço de R$%.2f%n" ,produto1, preco1);
		System.out.printf("%s custa o preço de R$%.2f%n", produto2, preco2);
		System.out.printf("Gravar: %d anos, código id %d , gênero %s%n", idade, codigo, genero);
		System.out.printf("medida = %.8f%n" , medida);
		System.out.printf("medida = %.3f%n" , medida);
		
		System.out.printf("medida = %.3f%n" , medida);
		
	}

}
