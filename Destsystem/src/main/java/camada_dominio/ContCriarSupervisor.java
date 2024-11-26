package camada_dominio;

public class ContCriarSupervisor {
	//public CamadaDadosInterface dados = new CamadaDadosMock(); 
	
	public enum Tipos {
		VERIFICAR_NUMERO_ESTAGIO, CRIAR_SUPERVISOR
	}
	
	public Object servico(Tipos tipoServico, String numeroPedidoEstagio) {
		switch (tipoServico) {
			case VERIFICAR_NUMERO_ESTAGIO:
				Command rt = new VerificarNumeroEstagioRTC(numeroPedidoEstagio);
				return rt.executar();
			default:
				return null;
		}
	}		
}
