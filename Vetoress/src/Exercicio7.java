import java.util.Scanner;

public class Exercicio7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] resultante = new int[20];
		int j=0;
	

		// Carregar vetores
		// VETOR 01
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o n�mero no vetor 1 - posi��o [" + i + "]:");
			vetor1[i] = entrada.nextInt();
		}

		// VETOR 02
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o n�mero no vetor 2 - posi��o [" + i + "]:");
			vetor2[i] = entrada.nextInt();
		}
		
		//INTERCALAR
		for (int i = 0; i < 10; i++) {
			
			resultante[j]=vetor1[i];
			System.out.println("vetor Resultante - posi��o"+(i+1)+"- valor: "+resultante[i]);
			j++;
			
			resultante[j]=vetor2[i];
			System.out.println("vetor Resultante - posi��o"+(i+1)+"- valor: "+resultante[i]);
			j++;
		
		}
		
		
		
		

	}

}