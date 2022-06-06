package model;


public class Pessoa {
	
	private String nome;
	private  int cpf ;
	private String datanascimento;
	
	
	//construtor da class Pessoa com inicialização de variaveis/atributos;
	
	public Pessoa() {
		
		this.nome =" ";
		this.cpf = ' ';
		this.datanascimento =" " ;	
	}
	
	
	//metodos acessores e modificadores get = Acessor  e	set = modificador 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	
	

}
