package aplicativo.funcionalidades.interfaces;

import java.util.Calendar;

public interface Produto {
	public void setValor(float valorProduto);
	public float getValor();
	
	public void setVendido(Calendar data);
	public boolean isVendido();
	
	public float getLucroMedio();
	
	public Calendar getDataVenda();
	public void setDataVenda(Calendar novaData);
	
	public void setLocalizador(String localizador);
	public String getLocalizador();
	
	
	
	
}
