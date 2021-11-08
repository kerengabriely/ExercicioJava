import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
	
	 int horas, minutos, segundos, tempo;
	 
	 Scanner leia = new Scanner (System.in);
	 
	 System.out.println("Quantos segundos durou o evento? ");
	 segundos = leia.nextInt();
	 
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);
		
		System.out.println("O evento tem duração de " + horas +" horas " + minutos + " minutos e " + segundos + " segundos.");
		horas = leia.nextInt();
		minutos = leia.nextInt();
		segundos = leia.nextInt();
		
	}
}
