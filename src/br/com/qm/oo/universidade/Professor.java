package br.com.qm.oo.universidade;
public class Professor extends Funcionario 
{
	private String nivelGraduacao;
	private String disciplina;
	private int qtdAlunos;
	private int qtdTurmas;	
	public Professor(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario,
					 String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas) 
	{
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplina = disciplina;
		this.qtdAlunos = qtdAlunos;
		this.qtdTurmas = qtdTurmas;
	}	
	public void adicionaTurma()
	{
		this.qtdTurmas++;
	}	
	public String getNivelGraduacao() 
	{
		return nivelGraduacao;
	}
	public void setNivelGraduacao(String nivelGraduacao) 
	{
		this.nivelGraduacao = nivelGraduacao;
	}
	public String getDisciplina() 
	{
		return disciplina;
	}
	public void setDisciplina(String disciplina)
	{
		this.disciplina = disciplina;
	}
	public int getQtdAlunos()
	{
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) 
	{
		this.qtdAlunos = qtdAlunos;
	}
	public int getQtdTurmas()
	{
		return qtdTurmas;
	}
	public void setQtdTurmas(int qtdTurmas)
	{
		this.qtdTurmas = qtdTurmas;
	}	
	@Override
	public String toString()
	{
		return "Professor Nível de graduacao=" + nivelGraduacao + ",\n Disciplina=" + disciplina + ",\n Quantidade de alunos=" + qtdAlunos
				+ ",\n Quantidade de turmas=" + qtdTurmas + ", toString()=" + super.toString() + "]";
	}	
}