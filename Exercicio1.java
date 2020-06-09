import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		int x,y;
		
		System.out.println("Digite um número:");
		x=leitor.nextInt();
		
		System.out.println("Multiplicado por:");
		y=leitor.nextInt();
		
		System.out.println("Igual á: "+(x*y));
	}

}
