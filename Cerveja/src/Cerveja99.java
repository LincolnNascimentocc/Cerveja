import java.util.Scanner;

public class Cerveja99 {
	
	public static void main(String[] args) {
		
		int cerveja = 100;
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
	    
		while(cerveja > 1) {
			System.out.println("Pego uma garrafa, passo para frente!!");
			cerveja = cerveja -1;
			System.out.println("Agora são" + cerveja + "cervejas no freezer");
			
			if(cerveja ==1) {
				System.out.println("Acabou todas as cervejas aguenta beber mais...?");
				System.out.println("Digite 1- Se aguentar");
				System.out.println("Digite 2- Se não aguentar");
				opcao = leitor.nextInt();
			
			   if(opcao==1) {
				   System.out.println("Freezer cheio...cuidado para não cair");
				  
			   }else {
					System.out.println("Freezer ficando vazio");
				
				}
			}
		}
	}
}
