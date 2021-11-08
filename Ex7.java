import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
	double a, b, c, d, e, f;
	double x, y;
	
	Scanner leia = new Scanner (System.in);
			
	System.out.println("O valor de A: ");
	a = leia.nextDouble();
	
	System.out.println("O valor de B: ");
	b = leia.nextDouble();
	
	System.out.println("O valor de C: ");
	c = leia.nextDouble();
	
	System.out.println("O valor de D: ");
	d = leia.nextDouble();
	
	System.out.println("O valor de E: ");
	e = leia.nextDouble();
	
	System.out.println("O valor de F: ");
	f = leia.nextDouble();
	

	x = ((c*e) - (b*f)) / ((a*e) - (b*d));
	y = ((a*f) - (c*d)) / ((a*e) - (b*d));

	System.out.println("O valor de X é: " + x + " e o valor de Y é: " + y);
	
	}

}