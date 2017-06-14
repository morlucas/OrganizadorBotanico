package aplicativo.implementacoes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Financas implements aplicativo.funcionalidades.interfaces.Financas {
	private List<EntradaValor> entradas = new ArrayList<>();
	private List<SaidaValor> saidas = new ArrayList<>();
	
	@Override
	public Calendar getDatPagamento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getReferencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getValorPago() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<SaidaValor> getSaidas() {
		return saidas;
	}

	public void setSaidas(List<SaidaValor> saidas) {
		this.saidas = saidas;
	}

	public List<EntradaValor> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<EntradaValor> entradas) {
		this.entradas = entradas;
	}

}
