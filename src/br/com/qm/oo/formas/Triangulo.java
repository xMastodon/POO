package br.com.qm.oo.formas;

public class Triangulo extends FormaGeometrica {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calculaArea() {
		System.out.println("-- Calculando a �rea do Tri�ngulo --");
		super.setArea((this.base * this.altura) / 2); 
	}

}