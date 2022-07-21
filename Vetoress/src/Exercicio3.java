import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[10];
		String nome;
		int verifica = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome:");
			nomes[i] = entrada.next();
			
		}

		System.out.println("Digite o nome para procurar o vetor:");
		nome = entrada.next();

		for (int indice1=0;indice1<10;indice1++) {
			if (nomes[indice1].equalsIgnoreCase(nome)) {
				verifica=1;
						
			}
		}
		if (verifica == 1) {
		System.out.println("Achei");
			}else {
		System.out.println("Não Achei");
		}
	}

	}
