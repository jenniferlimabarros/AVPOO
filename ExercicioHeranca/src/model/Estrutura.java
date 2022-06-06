package model;
//import java.util.ArrayList;

public class Estrutura {
	
	private String nomeestrutura;
	private Integer codigoestrutura;
	private Departamento departamento;
	
	
	public String getNomeestrutura() {
		return nomeestrutura;
	}
	
	public void setNomeestrutura(String nomeestrutura) {
		this.nomeestrutura = nomeestrutura;
	}
	
	public Integer getCodigoestrutura() {
		return codigoestrutura;
	}
	
	public void setCodigoestrutura(Integer codigoestrutura) {
		this.codigoestrutura = codigoestrutura;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
