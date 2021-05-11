package br.com.qm.oo.contabancaria;

public class ContaBancaria
{
	int nrConta;	
	String titular;
	float saldo;
	
	public ContaBancaria(int nrConta, String titular,float saldo)
		{
			this.nrConta = nrConta;			
			this.titular = titular;
			this.saldo = 0;
		}
	
	public boolean saque (float valor)
		{
			if (saldo >= valor && valor >0)
				{
					this.saldo -= valor;
					return true;
				}
			return false;
		}
	
	public boolean deposito (float valor)
		{		
			if (valor>0)
				{
					this.saldo += valor;
					return true;
				}
		return false;
					
		}
	
	public void extrato()
		{
			System.out.println("\n---------------EXTRATO-----------------");
			System.out.printf("\nConta número : %d",  this.nrConta);
			System.out.printf("\nCOrrentista: %s",  this.titular);
			System.out.printf("\nSaldo: %.2f",  this.saldo);
			
			
		}
	
	
}
