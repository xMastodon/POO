package br.com.qm.oo.cartao;

public class cartaoCredito 
{
	float limite;
	float saldo;
	String nomeCliente;
	
	public cartaoCredito(float limie,String nomeCliente)
	{
		this.limite = limite;
		this.saldo = 0;
		this.nomeCliente = nomeCliente;
	}
	
	public void aumentaLimite (float valorAcrescido)
	{		
		if (valorAcrescido > 0) 
			{this.limite += valorAcrescido;}
		
	}
	
	public void diminuiLimite (float valorDescrecido)
	{
		if (valorDescrecido > 0 && valorDescrecido <= this.limite)
		{
			this.limite -= valorDescrecido;
		}
	}
	
	public void realizaCompra (float valorCompra)
	{
		float novoSaldo = saldo + valorCompra;
		if (novoSaldo <= this.limite)
		{
			this.saldo = novoSaldo;
		}
	}
	
	public void imprimeFatura()
	{
		System.out.println("-------------------------------");
		System.out.printf("\n%.s\n", this.nomeCliente);
		System.out.printf("\nO seu limite é: %.2f\n", this.limite);
		System.out.printf("\nVocê já gastou: %.2f\n", this.saldo);
		System.out.printf("\nVocê ainda pode gastar: %.2f\n",this.limite - this.saldo);
		System.out.println("-------------------------------");
	}	
}
