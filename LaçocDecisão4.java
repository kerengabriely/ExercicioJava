package Exercícios;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
	
	    
	    if(numero % 2 == 0) {
	    	System.out.println("Este número é par.");
	    	double numeroRaiz = Math.sqrt(numero);
	    	System.out.println("A raiz quadrada deste número é: " + numeroRaiz);
	    }
	    
	    else if(numero % 2 == 1) {
	    	System.out.println("Este número é ímpar.");
	    	double numeroPot = Math.pow(numero, 2.0);
	    	System.out.println("A potência deste número é: " + numeroPot);
	    }
	    
	    leia.close();
    }

}
