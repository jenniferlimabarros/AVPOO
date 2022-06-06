
public class Empresa  implements PlanilhaFerias{
	
	private String nomeempresa;
	private Integer cnpj;
	private String enderecoempresa;
	private Estrutura estrutura;
	private Integer quantidadediastrabalho;
	private boolean concedimentoparaferias;
	
	
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
	public Integer getQuantidadediastrabalho() {
		return quantidadediastrabalho;
	}
	public void setQuantidadediastrabalho(Integer quantidadediastrabalho) {
		this.quantidadediastrabalho = quantidadediastrabalho;
	}
	
	public boolean getConcedimentoparaferias() {

		return concedimentoparaferias;
	}
	public void setConcedimentoparaferias(boolean concedimentoparaferias) {
		this.concedimentoparaferias = concedimentoparaferias;
	}

	///// metodos interface
	
	
	public void RecebiFerias() {
	
			
			System.out.println("Funcionario recebi ferias");
		
			
			
	}
	
	public void NaoRecebiFerias() {
		
			
			System.out.println("Funcionario não completou tempo de ferias ");
			
		
	}
	
}
