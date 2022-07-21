import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		String[] nome= new String[12];
		double[] total= new double[12];
		float[] perc= new float[12];
		String[] estado= new String[12];
	
		
		
		for(int i=0; i<1; i++) {
		System.out.println("Digite o nome do vendedor:");
		nome[i]= entrada.next();
		System.out.println("Digite o total de vendas:");
		total[i]=entrada.nextDouble();
		System.out.println("Digite o percentual das vendas:");
		perc[i]=entrada.nextFloat()/100;
		System.out.println("Digite o estado do vendedor:");
		estado[i]=entrada.next();
		
		}
		for(int i=0; i<1; i++) {
			System.out.println(nome[i]+ "\t" + total[i] +"\t"+ perc[i] + "\t"+total[i]*perc[i]+ "\t"+estado[i]);
		}
		
		
	}

}
