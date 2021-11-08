import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int dias, anos, meses, idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Há quantos dias você nasceu? ");
		dias = leia.nextInt();

	     anos = (dias / 365);
	     meses = ((dias % 365) / 30);
	     dias = ((dias % 365) % 30);
		
	     System.out.println("Você tem " + anos + " anos " + meses + " meses, e " + dias + " dias. ");
		
		}
		
	}
