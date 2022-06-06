import java.util.ArrayList;
public class Setor {
	
	private String dadosetor;
	private Integer codigosetor;
	private ArrayList<Profissional> profissional = new ArrayList<Profissional>();
	
	public String getDadosetor() {
		return dadosetor;
	}
	public void setDadosetor(String dadosetor) {
		this.dadosetor = dadosetor;
	}
	public Integer getCodigosetor() {
		return codigosetor;
	}
	public void setCodigosetor(Integer codigosetor) {
		this.codigosetor = codigosetor;
	}
	public ArrayList<Profissional> getProfissional() {
		return profissional;
	}
	public void setProfissional(ArrayList<Profissional> profissional) {
		this.profissional = profissional;
	}
	
	public void  IniciaRefeicão(){
		
		System.out.println("Comendo refeição");
		
	}
	public void EncerrarRefeicao() {
		
		System.out.println("Refeição acabada");
	}
	
	
	
}
