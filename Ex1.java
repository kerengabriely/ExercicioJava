import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos anos voc� tem? ");
		anos =  leia.nextInt();
		
		System.out.println("H� quantos meses voc� completou? ");
		meses = leia.nextInt();
		
		System.out.println("H� quantos dias voc� completou " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();

		idade = (365 * anos) + (30 * meses) + dias;

		System.out.println("Voc� nasceu h� " + idade + " dias.");
	}
}
