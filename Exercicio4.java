import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner ( System.in);
		
		double x,y;
		int opr;
		
		System.out.println("Digite dois n�meros:");
		x=leitor.nextDouble();
		y=leitor.nextDouble();
		System.out.println("E depois a opera��o desejada:");
		System.out.println("1- Soma");
		System.out.println("2- Subtra��o");
		System.out.println("3- Divis�o");
		System.out.println("4- Multiplica��o");
		opr=leitor.nextInt();
		
		switch (opr) {
		
	case 1:
		System.out.println("Igual �: "+(x+y));
		break;
	case 2:
		System.out.println("Igual �: "+(x-y));
		break;
	case 3 :
		System.out.println("Igual �: "+(x/y));
		break;
	case 4 :	
		System.out.println("Igual �: "+(x*y));
		break;
		
		default: System.out.println("Imposs�vel completar essa opera��o:");

		}
	}
}
