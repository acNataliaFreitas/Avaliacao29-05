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
	
		while( opcao == 's'){
			System.out.print("Nome: ");
			nome=sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas=sc.nextDouble();
			if(horasTrabalhadas< 0.0) {
				System.out.print("VALOR INVALIDO, POR FAVOR DIGITE NOVAMENTE!");
				horasTrabalhadas=sc.nextDouble();
			}
			System.out.print("Digitar outro (S/N)? ");
			nome=sc.next();

		}
		
		
		
		
		sc.close();
	}

}
