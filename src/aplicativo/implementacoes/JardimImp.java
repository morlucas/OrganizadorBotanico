package aplicativo.implementacoes;

import java.util.ArrayList;
import java.util.List;

import aplicativo.funcionalidades.interfaces.Jardim;
import aplicativo.funcionalidades.interfaces.Vaso;

public class JardimImp implements Jardim{
	List<Vaso> vasos = new ArrayList<>();
	@Override
	public void adicionar(Vaso novoVaso) throws Exception {
		if(novoVaso == null) throw new Exception("Vaso n�o existe.");
		vasos.add(novoVaso);
	}

	@Override
	public void remover(Vaso vaso) throws Exception {
		int index = vasos.indexOf(vaso);
		if(index < 0) throw new Exception("Vaso n�o existe no jardim");
		vasos.remove(index);	
	}

	@Override
	public List<Vaso> listarVasos() {
		return vasos;
	}
	
}
