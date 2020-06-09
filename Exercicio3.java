import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		double x,y,z,a;
		
		System.out.println("Digite 4 números e veja se vc foi aprovado:");
		
		x=leitor.nextDouble();
		y=leitor.nextDouble();
		z=leitor.nextDouble();
		a=leitor.nextDouble();
		
		if((x+y+z+a)/4 >=7) {
			
			System.out.println("Sua média é "+(x+y+z+a)/4+", aprovado!");
		}
		
		else {
			System.out.println("Sua média é "+(x+y+z+a)/4+", reprovado!");
	
		}
	}
}

