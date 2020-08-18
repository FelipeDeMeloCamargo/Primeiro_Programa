import java.util.Locale;

public class imprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Maria";
		int idade = 31;
		double renda = 4000;		
		double x = 10.35784;
				
		System.out.println(x);
		System.out.printf("%.2f%n", x); //2 casas decimais
		System.out.printf("%.4f%n", x); //4 casas decimais
		Locale.setDefault(Locale.US); //mudar para . o resultado ao invés de virgula
		System.out.printf("%.4f%n", x); //4 casas decimais 
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n" , x);
		
		//%f = ponto flutuante ou valor quebrado com .
		//%d = inteiro
		//%s = texto
		//%n = Quebra de linha
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		
	
		
	}

}
