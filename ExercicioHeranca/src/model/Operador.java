package model;

// model do padrao MVC  para colocar as modelagens 


// Operador recebe herança de profissional
public class Operador extends Profissional {
	
	private Integer matricula;
	private Integer codigo;
	
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	//metodos para polimorfismo vindo de profissional onde pode ser implementado de varias formas
	
	
	// o @Override = reescrever  para metodos que são herdados
	@Override
	public void RegistraPonto(boolean registro) {
		
		
		System.out.println( "Nome: " + getNome()+ "  Operador Trabalhando");
	}
	
	@Override
	public void NaoRegistraPonto(boolean registro) {
		
		//System.out.println("///////////////////////////REISTRO DE PONTO///////////////////////////////////////////////////////////" );
		System.out.println( "Nome: " + getNome()+ "  Operador Ausente");
		
	}
	

}
