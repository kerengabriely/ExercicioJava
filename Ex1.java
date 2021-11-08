import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos anos você tem? ");
		anos =  leia.nextInt();
		
		System.out.println("Há quantos meses você completou? ");
		meses = leia.nextInt();
		
		System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();

		idade = (365 * anos) + (30 * meses) + dias;

		System.out.println("Você nasceu há " + idade + " dias.");
	}
}
