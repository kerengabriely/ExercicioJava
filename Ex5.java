import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		int nota1, nota2, nota3, multiplicacao, Totalnota1, Totalnota2, Totalnota3, media;
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite nota1 ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite nota2 ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite nota3 ");
		nota3 = leia.nextInt();
		
	    Totalnota1 = nota1 * 2;
	    Totalnota2 = nota2 * 3;
	    Totalnota3 = nota3 * 5;

	    media = (Totalnota1 + Totalnota2 + Totalnota3) / 10;

	    System.out.println("A media do aluno é " + media + ".");
		
	}

}
