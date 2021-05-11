package br.com.qm.oo.contabancaria;

import java.util.Scanner;

public class ProgramaPrincipal 
{	
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria(1,"Rogerio Wehner");
		
		conta.extrato();
		conta.deposito(9600);
		conta.extrato();
		conta.saque(9750);
		conta.extrato();
		conta.saque(4230);
		conta.extrato();
		
		teclado.close();
	}	
}
