package desafio1;

public class Quadrado implements AreaCalculavel{
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado(double lado) {
		setLado(lado);
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

	
}
