
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
	
	//metodos para polimorfismo
	
	
	@Override
	public void RegistraPonto(boolean registro) {
		
		System.out.println("Recebi ferias");
	}
	
	@Override
	public void NaoRegistraPonto(boolean registro) {
		
		System.out.println("Não Recebi ferias");
		
	}
	

}
