package Exerc�cios;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
	
	    
	    if(numero % 2 == 0) {
	    	System.out.println("Este n�mero � par.");
	    	double numeroRaiz = Math.sqrt(numero);
	    	System.out.println("A raiz quadrada deste n�mero �: " + numeroRaiz);
	    }
	    
	    else if(numero % 2 == 1) {
	    	System.out.println("Este n�mero � �mpar.");
	    	double numeroPot = Math.pow(numero, 2.0);
	    	System.out.println("A pot�ncia deste n�mero �: " + numeroPot);
	    }
	    
	    leia.close();
    }

}
