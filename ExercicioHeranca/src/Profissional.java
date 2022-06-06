public class Profissional  {
	
	private String nome;
	private Integer cpf;
	private String datanascimento;
	private Setor setores;
	
	
///////////metodos set e get
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Setor getSetores() {
		return setores;
	}
	public void setSetores(Setor setores) {
		this.setores = setores;
	}
	
	//polimorfismo
	
	public void RegistraPonto(boolean registro) {
		
		System.out.println("Recebi ferias");
	}
	
	public void NaoRegistraPonto(boolean registro) {
		
		System.out.println("Não Recebi ferias");
		
	}
		
	
		
}
