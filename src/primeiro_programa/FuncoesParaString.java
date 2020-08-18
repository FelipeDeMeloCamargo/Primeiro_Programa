package primeiro_programa;

public class FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); //Serve para mudar a string pra minusculo
		String s02 = original.toUpperCase(); //Serve para mudar a tring toda pra maiuscula
		String s03 = original.trim(); // Serve para retirar os espaços extras da string
		String s04 = original.substring(2);//Serve para pular a quantidade de caracteres iniciais que deseja
		String s05 = original.substring(2,9); // Serve para pular a quantidade de caracteres iniciais e até ao qual deseja e os exiba
		String s06 = original.replace('a', 'x'); //Troca uma letra solicitada por outra
		String s07 = original.replace("abc", "xy"); //Troca uma letra solicitada por outra
		int i = original.indexOf("bc"); //retorna a posicao em que a string está em numero.
		int j = original.lastIndexOf("bc"); //Qual a ultima posicao que a string está em numero
		
		String s = "batata maca limao"; //grava na string as 3 palavras
		String[] vect = s.split(" ");// usa o espaço em branco como separador
		String word1 = vect[0]; //Grava as palavras separadas em vetores
		String word2 = vect[1];
		String word3 = vect[2];		
		
		
		System.out.println("Original"+ original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03 +     "-");
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
		
	}

}
