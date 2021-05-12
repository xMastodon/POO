package br.com.qm.oo.elevador;

public class Elevador 
{
	int andarAtual;
	int totalAndares;
	int capacidade;
	int qtdPessoas;
	
	public Elevador(int totalAndares, int capacidade) 
	{
		this.andarAtual = 0;
		this.qtdPessoas = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void entra()
	{
		if (qtdPessoas < capacidade) 
		{
			qtdPessoas++;
		}
	}
	
	public void sai()
	{
		if (qtdPessoas > 0) 
		{
			qtdPessoas--;
		}
	}
	
	public void sobe()
	{
		if (andarAtual < totalAndares) 
		{
			andarAtual++;
		}
	}
	
	public void desce()
	{
		if (andarAtual > 0) 
		{
			andarAtual--;
		}
	}
	
	public void status()
	{
		System.out.println("-----------------------");
		System.out.printf("\nO elevador está no andar: %d\n", this.andarAtual);
		System.out.printf("\nHá %d pessoas no elevador\n", this.qtdPessoas);
		System.out.println("-----------------------");
	}
}
