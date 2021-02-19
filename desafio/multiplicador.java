import java.util.Scanner;

public class Multiplicador {
	
	public static Object main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int multiplicando = input.nextInt();		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		
		verificarInput(multiplicando, inicio, fim);
		
		public static boolean verificarInput(int multiplicando, int inicio, int fim) {
			
			 if(verificarInput(multiplicando, inicio, fim)) {
	    	  System.out.println("multiplicando:" + multiplicando);
	    	  System.out.println("Início do intervalo:" + inicio);
	    	  System.out.println("fim do intervalo:" + fim);
	    	  
	    	  for(int i = inicio; i <= fim ; i++) {
	    		  System.out.println(multiplicando + "x" + i + "=" + multiplicando * i );
			
			
		}
		
	}

}
public static Boolean verificarInput(int multiplicando, int inicio, int fim) {
		
		if(multiplicando < 0) {
			System.out.println("O multiplicando não pode ser negativo");
		
		} else if(multiplicando > 3000) {
			System.out.println("O multiplicando não pode ser maior que 3000");
			
		} else if(inicio < 0 || fim < 0) {
			System.out.println(" Os intervalos não  podem  ser  números negativos");
			
		} else if(inicio > 3000 || fim > 3000) {
			
			System.out.println(" Os intervalos não  podem  ser  maior que 3000");
		} else if (inicio > fim) {
			System.out.println("intervalos invalidos");
		} else if (fim - inicio > 10) {
			System.out.println("intervalos invalidos");
		} else {
			return true;
		}
		

		return false;
	}

}
