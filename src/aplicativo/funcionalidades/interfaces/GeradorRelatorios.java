package aplicativo.funcionalidades.interfaces;

import java.util.ArrayList;
import java.util.Calendar;

public interface GeradorRelatorios {
	public long quantidadeDePlantas(ArrayList<Planta> plantas);
	public long quantidadeDePlantas(ArrayList<Planta> plantas,Calendar dataInicial, Calendar dataFim);
	
	public long quantidadeDeSementes(ArrayList<Semente> sementes);
	public long quantidadeDeSementes(ArrayList<Semente> sementes, Calendar dataInicial, Calendar dataFim);
	
	public long quantidadePlantada(ArrayList<Plantada> plantadas);
	public long quantidadePlantada(ArrayList<Plantada> plantadas, Calendar dataInicial, Calendar dataFim);
	
	public long quantidadeDeProdutos(ArrayList<Produto> produtos);
	public long quantidadeDeProdutos(ArrayList<Plantada> plantadas, Calendar dataInicial, Calendar dataFim);
	
	public long quantidadeDeRecursos(ArrayList<Recurso> recursos);
	public long quantidadeDeRecursos(ArrayList<Plantada> plantadas, Calendar dataInicial, Calendar dataFim);
	
	public long quantidadeDePagamentos(ArrayList<SaidaValor> pagamentos);
	public long quantidadeDePagamentos(ArrayList<Plantada> plantadas, Calendar dataInicial, Calendar dataFim);
	
	public long quantidadeDeRecebimentos(ArrayList<Recebimento> recebimentos);
	public long quantidadeDeRecebimentos(ArrayList<Recebimento> recebimentos, Calendar dataInicial, Calendar dataFim);
	
	public float lucroMedio(Calendar dataInicial, Calendar dataFim);
	
	
	
}
