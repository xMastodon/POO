package br.com.qm.oo.televisao;

public class ControleRemoto
{
	private Televisao televisao;
	private int volumeMax;
	private int volumeMin;
	private int canalMax;
	private int canalMin;
	
	public ControleRemoto (int volumeMax, int volumeMin, int canalMax, int canalMin)
	{
		this.televisao = new Televisao (0,0);
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.canalMax = canalMax;
		this.canalMin = canalMin;
		
	}
	
	public void aumentaVolume()
	{
		int volumeAtual = this.televisao.getVolumeAtual();
		if (volumeAtual < this.volumeMax)
		{
			this.televisao.setVolumeAtual(volumeAtual + 1);
		}
	}
	
	public void diminuiVolume()
	{
		int volumeAtual = this.televisao.getVolumeAtual();
		if (volumeAtual > this.volumeMin)
		{
			this.televisao.setVolumeAtual(volumeAtual - 1);
		}
	}
	
	public void proximoCanal()
	{
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMax)
		{
			this.televisao.setCanalAtual(canalAtual + 1);
		}
	}
	
	public void voltaCanal()
	{
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMin)
		{
			this.televisao.setCanalAtual(canalAtual - 1);
		}
	}
	
	public void trocaCanal(int novoCanal)
	{
		if (novoCanal >= this.canalMin && novoCanal <= this.canalMax)
		{
			this.televisao.setCanalAtual(novoCanal);
		}
	}
	
	public void consultaTv()
	{
		System.out.println("-----------------------------");
		System.out.printf("\nCanal Atual: %d\n",this.televisao.getCanalAtual());
		System.out.printf("\nVolume Atual: %d\n",this.televisao.getVolumeAtual());		
		System.out.println("-----------------------------");
	}

}
