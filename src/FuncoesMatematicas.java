
public class FuncoesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, a, b, c;
		
		x = 9.0;
		y = 2.0;
		a = (double) Math.sqrt(x);//Serve pra retornar a raiz quadrada de x
		b = (double) Math.pow(x,y);//Serve para retornar o x elevado a y como potência
		c = (double) Math.abs(x); //Serve para retornar o valor absoluto, no caso se o 9 fosse negativo, retornaria ele positivo
		
		//+ adicao
		//- subtracao
		//* Multiplicacao
		// /divisao
		//% resto divisao
		
		//báscara
		//delta = Math.pow(b, 2.0) - 4 *a*c;  b²-4ac
		//x1 = (-b + Math.sqrt(delta)) / (2.0 *a); b +\- raiz de delta sobre 2 vezes a
		//x2 = (-b - Math.sqrt(delta)) / (2.0 *a);
		
		
		System.out.printf("%.0f%n", a);
		System.out.printf("%.0f%n", b);
		System.out.printf("%.0f%n", c);
		
		
		
	}

}
