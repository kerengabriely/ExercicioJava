package Exercícios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Idade pessoa: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14){
			System.out.println("Classificado como infantil.");
		}
	    
		else if(idade >= 15 && idade <= 17){
		     System.out.println("Classificado como juvenil.");
		}
	   
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Classificado como adulto.");
		}
		
		else {
			System.out.println("Idade Inválida.");
		}
		
		leia.close();
	}
	

}
