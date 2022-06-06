
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
	
	//metodos para polimorfismo
	
	
	@Override
	public void RegistraPonto(boolean registro) {
		
		if(registro == true) {
			
			System.out.println("Compareceu ao trabalho");
			
		}else {
		
		System.out.println("Não Compareceu ao trabalho");
		}
	}
	
	@Override
	public void NaoRegistraPonto(boolean registro) {
		

		if((registro == false) &&  (registro != true)) {
			
			System.out.println("Não Compareceu ao trabalho");
			
		}else {
		
			System.out.println("Não esta no registro xde trabalhadores");
		}
		
	}
	
}
