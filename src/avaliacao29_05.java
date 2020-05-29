import java.util.Locale;
import java.util.Scanner;

public class avaliacao29_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		double horasTrabalhadas;
		char opcao='s';
		
		//LEITURA DE DADOS 
		System.out.print("Nome: ");
		nome=sc.next();
		System.out.println("Horas trabalhadas: ");
		horasTrabalhadas=sc.nextDouble();
		System.out.println("Digitar outro (S/N)? ");
		nome=sc.next();
		
		while( opcao == 's'){
			System.out.print("Nome: ");
			nome=sc.next();
			System.out.println("Horas trabalhadas: ");
			horasTrabalhadas=sc.nextDouble();
			System.out.println("Digitar outro (S/N)? ");
			nome=sc.next();
		}
		
		
		sc.close();
	}

}
