import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		
		double novoSalario;
		
		String[] arrayNomeFunc = new String[5];
		double[] arraySalario = new double[5];
		int[] arrayTempo = new int[5];
		
		
		for(int i=0;i<5;i++) {
			System.out.println("------------"+(i+1)+ "º funcionário---------");
			System.out.println("Informe o nome do funcionário: ");
			arrayNomeFunc[i] = entrada.next();
			
			System.out.println("Informe o salario do funcionário: ");
			arraySalario[i] = entrada.nextDouble();
			
			System.out.println("Informe o tempo de serviço do funcionário: ");
			arrayTempo[i] = entrada.nextInt();
				}
		
		System.out.println("---------------------Funcionários que não terão aumento---------------");
		
		for(int i=0; i<5;i++) {
			if(arrayTempo[i] <= 5 && arraySalario[i] >= 780) {
				System.out.println(arrayNomeFunc[i]);
			}
		}
		System.out.println("---------------------Funcionários que terão aumento---------------");
		for(int i=0; i<5; i++) {
			if(arrayTempo[i] > 5 || arraySalario[i] < 780) {
				
				if(arrayTempo[i] > 5 && arraySalario[i] < 780) {
					novoSalario = arraySalario[i] + (arraySalario[i] * 0.35);
					
				}else {
					if(arrayTempo[i] > 5) {
						novoSalario = arraySalario[i] + (arraySalario[i] * 0.25);
						
					}else {
						novoSalario = arraySalario[i] + (arraySalario[i] * 0.15);
						
					}
				}
				
				System.out.println("Nome: "+ arrayNomeFunc[i] + "\t - novo salario" + numFormatado.format(novoSalario));
				
			}
		}
		
		entrada.close();
		
		

}

}




















