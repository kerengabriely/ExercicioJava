import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int dias, anos, meses, idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("H� quantos dias voc� nasceu? ");
		dias = leia.nextInt();

	     anos = (dias / 365);
	     meses = ((dias % 365) / 30);
	     dias = ((dias % 365) % 30);
		
	     System.out.println("Voc� tem " + anos + " anos " + meses + " meses, e " + dias + " dias. ");
		
		}
		
	}
