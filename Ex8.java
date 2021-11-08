import java.util.Scanner;

public class Ex8 {

  public static void main(String[] args) {
	
	    int custoF, totalC;

	    Scanner leia = new Scanner (System.in);
	    
	    System.out.println("Qual o custo de fabrica ? ");
	    custoF = leia.nextInt();
	    
	    totalC = ((custoF / 100) * 45) + ((custoF / 100) * 28) + custoF;

	    System.out.println("O valor final do carro é de " + totalC + " reais.");
			
		}
	}
