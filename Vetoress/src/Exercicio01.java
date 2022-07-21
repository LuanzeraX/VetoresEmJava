import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		double [] temp = new double [12];
		String [] meses = new String [] {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		int indMaior=0, indMenor=0;
		double tempMaior=0, tempMenor=0;
		
		for(int i =0;i<12;i++) {
			
			System.out.print("Informe a temperatura do mês "+meses[i]+":");
			temp[i]=entrada.nextDouble();
			
			if( i == 0) {
				tempMenor = temp[i];
				indMenor=i;
			}
			
			
			
			if(temp[i] > tempMaior) {
				tempMaior = temp[i];
				indMaior = i;
				
			}
			
			if(temp[i] < tempMenor) {
				tempMenor= temp[i];
				indMenor = i;
			}
		}
		System.out.println("Maior temperatura "+ tempMaior+" - "+ meses[indMaior]);
		System.out.println("Maior temperatura "+ tempMenor+" - "+ meses[indMenor]);
	}

}
