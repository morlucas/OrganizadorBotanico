package aplicativo.funcionalidades.interfaces;

public interface Vaso {
	public void adicionar(Planta planta);
	public void remover(Planta planta) throws IndexOutOfBoundsException;
	public void setLocalizador(String novoLocalizador);
	public String getLocalizador();
	public void setObs(String obs);
	public String getObs();
	
	
}
