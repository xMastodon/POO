package br.com.qm.oo.universidade;
public class Funcionario 
{
	private String nome;
	private String cpf;
	private int nroRegistro;
	private String orgaoLotacao;
	private double salario;	
	public Funcionario(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.nroRegistro = nroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	}
	public String getOrgaoLotacao()
	{
		return orgaoLotacao;
	}
	public void setOrgaoLotacao(String orgaoLotacao)
	{
		this.orgaoLotacao = orgaoLotacao;
	}
	public double getSalario()
	{
		return salario;
	}
	protected void setSalario(double salario)
	{
		this.salario = salario;
	}
	public String getNome()
	{
		return nome;
	}
	public String getCpf() 
	{
		return cpf;
	}
	public int getNroRegistro()
	{
		return nroRegistro;
	}	
	public void aumentaSalario()
	{
		this.salario = this.salario * 1.1;		
	}	
	@Override
	public String toString()
	{
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", nroRegistro=" + nroRegistro + ", orgaoLotacao="
				+ orgaoLotacao + ", salario=" + salario + "]";
	}	
}