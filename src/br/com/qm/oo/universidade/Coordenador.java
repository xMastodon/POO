package br.com.qm.oo.universidade;

import java.util.Arrays;

public class Coordenador extends Funcionario
{	
	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario)
	{
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[2];
	}

	public Professor[] getProfessoresSupervisionados()
	{
		return professoresSupervisionados;
	}
	
	public void adicionaProfessor(Professor professor) throws UniversidadeException
	{
		
		for (int i = 0; i < this.professoresSupervisionados.length; i++)
		{
			if (this.professoresSupervisionados[i] != null 
					&& this.professoresSupervisionados[i].getCpf().equals(professor.getCpf()))
			{
				throw new UniversidadeException(String.format("O professor com o cpf %s já é coordenado por esse coordenador!", professor.getCpf()));
			}
			
			if (this.professoresSupervisionados[i] == null)
			{
				this.professoresSupervisionados[i] = professor;
				return;
			}
			
		}
		
		throw new UniversidadeException(
				String.format("Não é possível adicionar um professor pois o coordenador já possui %d professores coordenados.",
						this.professoresSupervisionados.length));
		
	}
	
	public void aumentaSalario()
	{
		
		super.setSalario(super.getSalario() * 1.05);
		
	}

	@Override
	public String toString()
	{
		return "Coordenador [professoresSupervisionados=" + Arrays.toString(professoresSupervisionados) + "]";
	}
	
}