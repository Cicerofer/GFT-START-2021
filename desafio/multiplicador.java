import java.util.Scanner;

public class Multiplicador {
	
	public static Object main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int multiplicando = input.nextInt();		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		
		verificarInput(multiplicando, inicio, fim);
		
		public static boolean verificarInput(int multiplicando, int inicio, int fim) {
			
			if(multiplicando < 0|| multiplicando > 3000) {
				System.out.println("O multipicando não pode ser negativo e não pode ser maior que 3000");
					return false;
			}
			
			return null;
		}
		
	}

}
