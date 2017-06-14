package aplicativo.funcionalidades.interfaces;

import java.util.List;

public interface Jardim {
	public void adicionar(Vaso novoVaso) throws Exception;
	public void remover(Vaso vaso) throws Exception;
	public List<Vaso> listarVasos();
	
}
