package aplicativo.funcionalidades.interfaces;

import java.util.Calendar;

public interface Semente extends Planta {
	public void setNome(String nome);
	public String getNome();
	
	public void setNomeEspecie(String especie);
	public String getNomeEspecie();
	
	public void setLocalizador(String localizador);
	public String getLocalizador();
	
	public void setQuantidade(int qnt);
	public int getQuantidade();
	
	public boolean isPlantada();
	
	public Plantada setIsPlantada(boolean isPlantada,
			int qntPlantada,
			Calendar dataPlantio,
			String localizador,
			String tipoDeJarro,
			String nomeEspecie,
			String nome,
			boolean isProduto) throws Exception;
	
	
	
}
