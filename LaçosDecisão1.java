package Exercícios;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite número 1: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite número 2: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite número 3: ");
		num3 = leia.nextInt();	
	
		if(num1 > num2 && num1 > num3) {
		System.out.println(num1 + ": este é o número maior.");
		}

	    else if(num2 > num1 && num2 > num3) {
	    System.out.println(num2 + ": este é o número maior.");
	    }
		
	    else {
	    	System.out.println(num3 + ": este é o número maior.");
	    	
	    }
		
		leia.close();
	}

}
