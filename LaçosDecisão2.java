package Exerc�cios;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		int num1, num2, num3;

		System.out.println("Digite o primeiro n�mero: " );
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo n�mero: " );
        num2 = leia.nextInt();

		System.out.println("Digite o terceiro n�mero" );
		num3 = leia.nextInt();

		if(num1 > num2 && num2 > num3){
			System.out.println("A ordem crescente �: "  + num3 +  " , "  + num2 +  " e "  + num1);
		}
		
		if(num2 > num1 && num1 > num3) {
			System.out.println("A ordem crescente �: "  + num3 +  " , "  + num1 +  " e "  + num2);
		}
		
	    if(num3 > num1 && num1 > num2) {
	    	System.out.println("A ordem crescente �: "  + num2 +  " , "  + num1 +  " e "  + num3);
		}
	    
		if(num1 > num3 && num3 > num2) {
			System.out.println("A ordem crescente �: "  + num2 +  " , "  + num3 +  " e "  + num1);
		}
		
		if(num2 > num3 && num3 > num1) {
			System.out.println("A ordem crescente �: "  + num1 +  " , "  + num3 +  " e "  + num2);
		}
		
		if(num3 > num2 && num2 > num1) {
			System.out.println("A ordem crescente �: "  + num1 +  " , "  + num2 +  " e "  + num3);
		}
		
		leia.close();
		
	}

}
