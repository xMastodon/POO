package br.com.qm.oo.cartao;

import java.util.Scanner;

public class ProgramaPrincipal
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		cartaoCredito cartao = new cartaoCredito(5000,"José");
		
		cartao.aumentaLimite(-500F);
		
		cartao.imprimeFatura();
		
		cartao.aumentaLimite(1000F);
		
		cartao.imprimeFatura();
		
		cartao.realizaCompra(3000);
		
		cartao.imprimeFatura();
		
		cartao.realizaCompra(3001);
		
		cartao.imprimeFatura();
		
		teclado.close();
	}	
}
