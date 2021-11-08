import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {

		double numeroA, numeroB, numeroC, d, r, s;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do numeroA: ");
		numeroA = leia.nextDouble();
		
		System.out.println("Digite o valor do numeroB: ");
		numeroB = leia.nextDouble();
		
		System.out.println("Digite o valor do numeroC: ");
		numeroC = leia.nextDouble();
		
		
		r = Math.pow ((numeroA + numeroB), 2.0);
		s = Math.pow ((numeroB + numeroC), 2.0);

		d = r + s / 2;

	    System.out.println("O resultado da expressão é " + d + ".");
		
	}

}
