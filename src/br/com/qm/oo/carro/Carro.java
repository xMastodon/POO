package br.com.qm.oo.carro;

public class Carro
{

	String nome;
	float peso;
	String fabricante;
	String cor;
	float valor;
	
public Carro(String nome, float peso, String fabricante, String cor, float valor) 
	{
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;		
	}
public void darDesconto (float porcentagem)
	{
		if (porcentagem > 0 && porcentagem <=10)
			{
				this.valor = this.valor * 1 - (porcentagem / 100F);
			}
	}
public void darDescontoGerente(float porcentagem)
	{
		if (porcentagem > 0 && porcentagem <=20)
			{
				this.valor = this.valor * 1 - (porcentagem / 100F);
			}
	}
public void pintar (String novaCor) 
 	{
		this.cor = novaCor;
 	}
public float getValor() {
	return valor;
}
public void setValor(float valor) {
	this.valor = valor;
}
public String getNome() {
	return nome;
}
public float getPeso() {
	return peso;
}
public String getFabricante() {
	return fabricante;
}
public String getCor() {
	return cor;
}

}

