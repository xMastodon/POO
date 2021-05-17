package br.com.qm.oo.formas;

public abstract class FormaGeometrica {
	
	//2. Fa�a um programa que calcule a �rea de uma figura geom�trica. 
	// Aceite quatro tipos de figura geom�trica: quadrado, ret�ngulo, 
	// tri�ngulo e c�rculo. 
	// Use heran�a, classe abstrata e polimorfismo.
	private double area;

	public FormaGeometrica() {
	}
	
	public abstract void calculaArea();

	public double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}
}