package br.com.qm.oo.elevador;

public class Elevador
{	
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;	
	
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
			return;
		}		
		throw new CargaElevadorException("O elevador est� em sua capacidade m�xima!");
	}	
	public void sai() throws CargaElevadorException
	{
		if (qtdPessoas > 0)
		{
			qtdPessoas--;
		}		
		throw new CargaElevadorException("O elevador j� est� vazio");
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
		System.out.println("----------");
		System.out.printf("\nO elevador est� no andar: %d\n", this.andarAtual);
		System.out.printf("\n H� %d pessoas no elevador.\n", this.qtdPessoas);
		System.out.println("----------");
	}
	public int getTotalAndares()
	{
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares)
	{
		this.totalAndares = totalAndares;
	}
	public int getCapacidade()
	{
		return capacidade;
	}
	public void setCapacidade(int capacidade)
	{
		this.capacidade = capacidade;
	}
	public int getAndarAtual()
	{
		return andarAtual;
	}
	public int getQtdPessoas()
	{
		return qtdPessoas;
	}
}