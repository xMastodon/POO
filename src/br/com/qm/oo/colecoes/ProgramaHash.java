package br.com.qm.oo.colecoes;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ProgramaHash
{
	
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		Map<String, String> dados = new HashMap<String, String>();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Digite um CPF");
			String cpf = teclado.next();
			System.out.println("Digite um nome:");
			String nome = teclado.next();
			dados.put(cpf, nome);
		}
		
		for (String nome : dados.values())
		{
			System.out.println(nome);
		}
		
		System.out.println("Digite um CPF para ser removido: ");
		String cpfRemovido = teclado.next();
		
		dados.remove(cpfRemovido);
		
		for (String nome : dados.values())
		{
			System.out.println(nome);
		}
		
		teclado.close();
	}
		
}