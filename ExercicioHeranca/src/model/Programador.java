package model;

public class Programador extends Profissional {
	
	private int salario;
	private Integer cargahoraria;
	
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public Integer getCargahoraria() {
		return cargahoraria;
	}
	
	public void setCargahoraria(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	
	//metodos para polimorfismo vindo de Profissional
	
	
	@Override
	public void RegistraPonto(boolean registro) {
		
		if(registro == true) {
			//System.out.println("///////////////////////////REISTRO DE PONTO///////////////////////////////////////////////////////////" );
			System.out.println( "Nome: " + getNome()+ " O programador Compareceu ao trabalho");
			
		}else {
			//System.out.println("///////////////////////////REISTRO DE PONTO///////////////////////////////////////////////////////////" );
			System.out.println( "Nome: " + getNome()+ " O programador Não Compareceu ao trabalho");
		}
	}
	
	@Override
	public void NaoRegistraPonto(boolean registro) {
		

		if(registro == false) {
			
			System.out.println("Nome: " + getNome()+  "Não Compareceu ao trabalho.");
			
		}else {
		
			System.out.println("Nome: " + getNome()+  "O programador Não esta no registro de trabalhadores");
		}
		
	}
	
}
