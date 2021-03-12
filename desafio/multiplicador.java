package desafio;

import java.util.Scanner;

public class Multiplicador {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		

		System.out.println("multiplicando: ");
		int multiplicando = input.nextInt();

		System.out.println("Innicio do intervalo: ");
		int inicio = input.nextInt();

		System.out.println("fim do intervalo: ");
		int fim = input.nextInt();


		if(verificarInput(multiplicando, inicio, fim)) {
			
			for(int i = inicio; i <= fim ; i++){
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
