package desafio1;

public class Teste {
	public static void main(String[] args) {
		
		
		Quadrado qd1 = new Quadrado(20);
		
		Retangulo rt1 = new Retangulo(32);
		
		Circulo cl1 = new Circulo(3.15);
		
		System.out.println("Area do Quadrado com " + qd1.getLado() +"cm de lado : " + qd1.calculaArea()  +  "cm");
		System.out.println("Area do Retangulo com "+ rt1.getLargura()  + "cm de lado : " + rt1.calculaArea() + "cm"); 
		System.out.println("Area do Circulo com raio de  "+ cl1.getRaio() +"cm de lado:  " + cl1.calculaArea()  + "cm");
		
	}
}
