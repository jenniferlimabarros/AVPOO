package model;
// pacote model para camada de  de modelagem  


// class profissional  recebe herança da Class Pessoa  
public class Profissional extends Pessoa implements PlanilhaFerias {
	
	private Programador programador;
	private Operador operador;
	private Setor setores;
	private Integer quantidadediastrabalho;
	private boolean concedimentoparaferias;
	
	
///////////metodos set= modificador  e get = Acessor
	public Programador getProgramador() {
		return programador;
	}
	public void setProgramador(Programador programador) {
		this.programador = programador;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	public Setor getSetores() {
		return setores;
	}
	public void setSetores(Setor setores) {
		this.setores = setores;
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
	
	//polimorfismo
	
	public void RegistraPonto(boolean registro) {
		
		if(registro == true) {
			
			System.out.println("Programador " + getNome() + "Presente no trabalho");
		}
		
	}
	
	public void NaoRegistraPonto(boolean registro) {

		if(registro == false) {
			
			System.out.println("Funcionario: " + getNome() + " Ausente no trabalho");
		}
		
	}
	
	/// metodo vindo de interface
	@Override
	
	public void RecebiFerias() {
		
			if(quantidadediastrabalho == 365) {
				
				System.out.println("Funcionario: " + getNome() + " Recebi ferias");
		
			}else{
				
				System.out.println("Funcionario ainda tem ferias: " + getNome() );
				
			}
			
	}
	
	@Override
	public void NaoRecebiFerias() {
	
			if(getConcedimentoparaferias() == true ) {
				
				//System.out.println("///////////////////////////PLANILHA FERIAS//////////////////////////////////////////////////////////" );
				System.out.println("Funcionario: " + getNome() + " Ferias concedidas");
				
			}else {
				
				System.out.println("Funcionario: " + getNome() + " Não ha Ferias concedidas " );
			}		
		
	}
	
		
}
