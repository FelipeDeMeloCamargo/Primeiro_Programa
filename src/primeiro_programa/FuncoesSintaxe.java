package primeiro_programa;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = maximo(a , b , c);
		imprimir(maior);
		sc.close();
		

	} // aqui encerra a função Main

	/*Essas funcoes declaradas servem para dar função a outras no programa principal como maximo ou imprimir
	 * Essas funcoes sao declaradas de acordo com o tipo delas, se ela armazena valor é int no caso deste ou
	 * se armazena nada é void*/
	public static int maximo(int x, int y, int z) {  
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	public static void imprimir(int valor) {
		System.out.println("Maior = "+ valor);
		
		
		
	}
}
