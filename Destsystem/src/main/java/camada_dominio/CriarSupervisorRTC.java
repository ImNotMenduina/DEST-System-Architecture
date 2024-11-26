package camada_dominio;

import camada_dados.GatewaySupervisor;
import entidades.SupervisorDTO;

public class CriarSupervisorRTC implements Command{
	
	private GatewaySupervisor dados = new GatewaySupervisor();
	private String nome;  
	private String email; 
	private String senha; 
	private String telefone; 
	private String nomeEmpresa;
	private String cnpj;
	private String numeroPedidoEstagio;
	private String funcao;

	public CriarSupervisorRTC(String nome, String email, String senha, String telefone, String nomeEmpresa, String cnpj,
			String numeroPedidoEstagio, String funcao) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.numeroPedidoEstagio = numeroPedidoEstagio;
		this.funcao = funcao;
	}

	@Override
	public Object executar() {
		SupervisorDTO supervisor = dados.buscar(numeroPedidoEstagio);
		
		if (supervisor == null) {			
			dados.inserir(nome, email, senha, telefone, nomeEmpresa, cnpj, numeroPedidoEstagio, funcao);
		}
		return null;
	}
}
