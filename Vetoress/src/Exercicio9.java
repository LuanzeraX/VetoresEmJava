import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] nomeProd= new String[10];
		int[] codProd= new int[10];
		double[] preco= new double[10];
		double percAumento=0;
		double novosPreco[]=new double[10];
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o nome do produto "+(i+1)+ " :");
			nomeProd[i]= entrada.next();
			System.out.println("Digite o código do produto "+(i+1)+ " :");
			codProd[i]= entrada.nextInt();
			System.out.println("Digite o preço do produto "+(i+1)+ " : ");
			preco[i]= entrada.nextDouble();

			if(preco[i] > 1000 && (codProd[i] % 2)==0) {
				novosPreco[i]= preco[i]*1.18;
				
			}else if((codProd[i]&2)==0) {
				novosPreco[i]=preco[i]*1.12;
				
			}else if(preco[i]>1000){
				novosPreco[i]=preco[i]*1.15;
				
			}
			
	}

}
}