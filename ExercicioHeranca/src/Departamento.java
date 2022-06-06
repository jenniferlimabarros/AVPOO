import java.util.ArrayList;

public class Departamento {
	
	private String descricao;
	private Integer codigodepartamento;
	private ArrayList<Setor> setores = new ArrayList<Setor>();
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCodigodepartamento() {
		return codigodepartamento;
	}
	public void setCodigodepartamento(Integer codigodepartamento) {
		this.codigodepartamento = codigodepartamento;
	}
	public ArrayList<Setor> getSetores() {
		return setores;
	}
	public void setSetores(ArrayList<Setor> setores) {
		this.setores = setores;
	}
	

}
