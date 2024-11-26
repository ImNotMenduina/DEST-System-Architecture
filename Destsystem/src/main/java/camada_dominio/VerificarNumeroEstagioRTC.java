package camada_dominio;

import camada_dados.GatewayPedido;
import entidades.PedidoDTO;

public class VerificarNumeroEstagioRTC implements Command{
	
	private String numeroPedidoEstagio;
	private GatewayPedido dados = new GatewayPedido();
	
	public VerificarNumeroEstagioRTC(String numeroPedidoEsString) {
		this.numeroPedidoEstagio = numeroPedidoEsString;
	}

	@Override
	public Object executar() {
		PedidoDTO pd = dados.buscar(numeroPedidoEstagio);
		
		return null;
	}
}
