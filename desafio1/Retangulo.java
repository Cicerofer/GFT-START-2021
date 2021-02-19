package desafio1;

public class Retangulo implements AreaCalculavel {

	private double largura;
	
	
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public Retangulo(double largura) {
		setLargura(largura);
	}

	@Override
	public double calculaArea() {
		return largura * largura;
	}

}
