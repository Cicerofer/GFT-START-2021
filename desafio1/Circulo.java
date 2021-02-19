package desafio1;

public class Circulo implements AreaCalculavel {

	private double PI = 3.1416;
	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		setRaio(raio);
	}
	
	@Override
	public double calculaArea() {
		return PI * (raio * raio);
	}

}
