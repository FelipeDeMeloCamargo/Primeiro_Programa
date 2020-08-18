import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		String y, z;
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		System.out.println("Você digitou: :");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
