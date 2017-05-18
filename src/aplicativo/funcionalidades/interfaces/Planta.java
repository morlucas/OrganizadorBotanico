package aplicativo.funcionalidades.interfaces;

import java.util.Calendar;

public interface Planta {
	public void setDataPlantio(Calendar data); //In the web, I found JodaTime library
	public Calendar getDataPlantio();
	public void setNome(String nomePlanta);
	public String getNome();
	public void setNomeEspecie(String nomeEspecie);
	public String getNomeEspecie();
}
