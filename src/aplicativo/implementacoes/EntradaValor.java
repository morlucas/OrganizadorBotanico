package aplicativo.implementacoes;

import java.util.Calendar;

public class EntradaValor {
	private Calendar dataEntrada;
	private String referencia;
	private long id;
	private String obs;
	
	public EntradaValor(Calendar dataEntrada, String referencia) {
		super();
		this.dataEntrada = dataEntrada;
		this.referencia = referencia;
	}

	public EntradaValor(Calendar dataEntrada, String referencia, String obs) {
		super();
		this.dataEntrada = dataEntrada;
		this.referencia = referencia;
		this.obs = obs;
	}
	
	public Calendar getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
}
