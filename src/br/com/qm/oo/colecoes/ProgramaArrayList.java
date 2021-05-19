package br.com.qm.oo.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaArrayList
{

	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		List<String> cores = new ArrayList<String>();		
		
		String corAtual = null;do
		{
			System.out.println("Digite uma cor:");
			corAtual = teclado.next();
			cores.add(corAtual);
		} while (!corAtual.equals("preto"));
		
		
		for (String cor : cores)
		{
			
			System.out.println(cor);
			
		}
		teclado.close();		
	}
	
}