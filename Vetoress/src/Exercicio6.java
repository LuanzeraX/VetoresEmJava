import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] gabarito= new String [8];
		String[] resp= new String[8];
		int numero[]= new int[10];
		int nota=0;
	
		
		System.out.println("-----------------Gabarito----------------");
		for(int i=0; i<gabarito.length; i++) {
			System.out.println("Digite a resposta da questão "+(i+1)+":");
			gabarito[i]=entrada.next();
			
			
			
		}
			
		
		for(int i=0;i<numero.length;i++) {
			System.out.println("---------------Aluno "+(i+1)+"---------------------");
			System.out.println("Digite o número do "+(i+1)+"º aluno:");
			numero[i]=entrada.nextInt();
			
			for(int cont=0;cont<resp.length;cont++) {
			System.out.println("Digite a resposta dada pelo aluno "+numero[i]+" à "+(cont+1)+"º questão:");
			resp[cont]=entrada.next().toUpperCase();
			if (resp[cont].equalsIgnoreCase(gabarito[cont]));{
				nota=+1;
			
				
				
			}
			
			}
			System.out.println("A nota do aluno: "+ numero[i]+" foi: "+nota);
			
			
			
			
		}
		
		//entrada.close();
		

	}}


