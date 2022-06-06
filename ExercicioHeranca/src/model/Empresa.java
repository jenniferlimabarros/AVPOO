package model;

public class Empresa  {
	
	private String nomeempresa;
	private Integer cnpj;
	private String enderecoempresa;
	private Estrutura estrutura;
	
	
	
	public String getNomeempresa() {
		return nomeempresa;
	}
	
	public void setNomeempresa(String nomeempresa) {
		this.nomeempresa = nomeempresa;
	}
	
	public Integer getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEnderecoempresa() {
		return enderecoempresa;
	}
	
	public void setEnderecoempresa(String enderecoempresa) {
		this.enderecoempresa = enderecoempresa;
	}
	
	public Estrutura getEstrutura() {
		return estrutura;
	}
	
	public void setEstrutura(Estrutura estrutura) {
		this.estrutura = estrutura;

	}

	
}
