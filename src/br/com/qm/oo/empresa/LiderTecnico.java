package br.com.qm.oo.empresa;

public class LiderTecnico extends Funcionario
{

	private Programador[] programadoresSupervisionados;

	public LiderTecnico(String nome, String cpf, double salario, double horasSemanais, int qtdProgramadores)
	{
		super(nome, cpf, salario, horasSemanais);
		this.programadoresSupervisionados = new Programador[qtdProgramadores];
	}

	public Programador[] getProgramadoresSupervisionados()
	{
		return programadoresSupervisionados;
	}
	
	public void insereProgramador(Programador programador)
	{
		
		for (int i = 0; i < this.programadoresSupervisionados.length; i++)
		{
			if (this.programadoresSupervisionados[i] == null)
			{
				this.programadoresSupervisionados[i] = programador;
				break;
			}
		}
		
	}
	
	public void imprimeNomesProgramadores()
	{
	
		
		for (Programador programador : this.programadoresSupervisionados)
		{
			if (programador != null)
			{
				System.out.println(programador.getNome());
			}
		}
	}
	
}