package aplicativo.funcionalidades.interfaces;

import java.util.ArrayList;
import java.util.Calendar;


public interface Planta {
	public void setDataPlantio(Calendar dataPlantio); //In the web, I found JodaTime library
	public Calendar getDataPlantio();
	
	public long getTempoDesdeoPlantio();
	
	public String getLocalizador();
	public void setLocalizador(String localizador);
	
	public void setNome(String nomePlanta);
	public String getNome();
	
	public void setNomeEspecie(String nomeEspecie);
	public String getNomeEspecie();
	
	public String getTipoDeJarro();
	public void setTipoDeJarro(String tipoDeJarro);
	
	public boolean isProduto();
	
	public void setIsProduto(boolean isProduto);
	
	public ArrayList<String> mostraTodosAtributos();
}
