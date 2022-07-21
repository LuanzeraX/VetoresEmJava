import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		double[] preco= new double[10];
		int quantidade[]= new int[10];
		double[] total= new double[10];
		double valorTotal=0, qtdMaior=0, maiorPreco=0;
		
		DecimalFormat formataMoeda= new DecimalFormat("R$ ###0.00");

		for(int i=0; i<10; i++) {
			System.out.println("---------------Produto:"+(i+1)+"-------------");
			System.out.println("Informe o preço unitário de cada objeto:");
			preco[i]=entrada.nextDouble();
			System.out.println("Informe a quantidade vendida:");
			quantidade[i]=entrada.nextInt();
			
			total[i]=preco[i]*quantidade[i];
			valorTotal += total[i];
			
			if(quantidade[i]> qtdMaior) {
				qtdMaior = quantidade[i];
				maiorPreco = preco[i];
			}
			
			
		}
		System.out.println("-------------Relatório de vendas------------");
		for(int i=0; i<10; i++) {
			
			System.out.println("Quantidade:"+quantidade[i]+"\t  Preço:"+preco[i]+"\t Total:"+ (total[i]));
			

			
		}
		
		System.out.println("Total Geral: \t" + valorTotal);
		System.out.println("-----------------------------------------------");
		System.out.println("Comissão: \t" + formataMoeda.format((valorTotal *0.05)));
		System.out.println("Preço da Maior quantidade:"+ maiorPreco);
	}

}
