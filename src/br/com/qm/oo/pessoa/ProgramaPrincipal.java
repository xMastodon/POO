package br.com.qm.oo.pessoa;

public class ProgramaPrincipal
{
	public static void main (String[] args)
	{
		Pessoa pessoa = new Pessoa("Rogério Wehner", 1988, 1.82F);
		
		pessoa.imprimeDados();
		
		pessoa.setAltura(1.79F);
		
		pessoa.imprimeDados();
		
		System.out.printf("\nO %s mede %.2f e tem %d anos", pessoa.getNome(), pessoa.getAltura(), pessoa.calculaIdade(2021));
	}
}
