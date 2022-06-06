package controller;

import model.Departamento;
import model.Empresa;
import model.Estrutura;
import model.Profissional;
import model.Operador;
import model.Programador;
import model.Setor;

public class StaticaMain {

	public static void main(String[] args) {
		
		// Criando objetos das class, preenchendo seus atributos e relacionando objetos;
		
		Profissional profissional1 = new Profissional();
		profissional1.setNome("Peter Parck");
		profissional1.setCpf( 02240530022);
		profissional1.setDatanascimento ("27/05/1992");
		
		Profissional profissional2 = new Profissional();
		profissional2.setNome("Harry");
		profissional2.setCpf(0022020021);
		profissional2.setDatanascimento ("20/06/1998");
		
		Programador programador = new Programador();
		programador.setNome("Peter Parck");
		programador.setCpf( 02240530022);
		programador.setDatanascimento ("27/05/1992");
		programador.setSalario(200000);
		programador.setCargahoraria( 16);
		
		Operador operador = new Operador();
		operador.setNome("Tony Stark");
		operador.setCpf(0022020021);
		operador.setDatanascimento ("20/06/1998");
		operador.setMatricula(202020);
		operador.setCodigo( 001);
		
		///////////////////////////////////////////////////
		Empresa empresa = new Empresa();
		empresa.setNomeempresa("NewPlay");
		empresa.setCnpj(00011122233);
		empresa.setEnderecoempresa("São Bento do Una -PE");
		
				
		Estrutura estrutura = new  Estrutura();
		estrutura.setCodigoestrutura(320);
		estrutura.setNomeestrutura("Funcional");
	
		
		Departamento departamento1 = new Departamento();
		departamento1.setDescricao("Recursos Humanos");
		departamento1.setCodigodepartamento(3030);
		
		Departamento departamento2 = new Departamento();
		departamento2.setDescricao("Financeiro");
		departamento2.setCodigodepartamento(3029) ;
		
		Setor setor1 = new Setor();
		setor1.setDadosetor("Operacional");
		setor1.setCodigosetor( 1);
		
		Setor setor2 = new Setor();
		setor2.setDadosetor("Funcional");
		setor2.setCodigosetor(2);
		
		
		empresa.setEstrutura (estrutura);
		estrutura.setDepartamento ( departamento1);
		departamento1.getSetores().add(setor1);
		setor1.getProfissional().add(programador);
		//setor1.getProfissional().add(profissional2);
	
		departamento1.getSetores().add(setor2);
		setor2.getProfissional().add(operador);
		//setor2.getProfissional().add(profissional4);

		
		//////////////////////////////////////////////////
		/*if(registro == true) {
			System.out.println("/////////////////////////////////////////////////// REGISTRO DE PONTO ENTRADA E SAIDA DO TRABALHO  ////////////////////////////////////////////////////////");
			System.out.println(getNome() + "Presente no trabalho"+ getNome());
		}*/
		
		//EMPRIMNINDO INFORMAÇÕES DA EMPRESA
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////" );
		System.out.println("Estrutura:  "+ estrutura.getNomeestrutura() );
		System.out.println("Código da estrutura: " + estrutura.getCodigoestrutura() );
		System.out.println("Departamento:  "+ departamento1.getDescricao() ); 
		System.out.println("Código do departamento: " + departamento1.getCodigodepartamento ());
		
		// for-each
		for( Setor s: departamento1.getSetores()) {
			
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////" );	
			System.out.printf("Setor:  "+ s.getDadosetor ()+ " Codigo do setor : " + s.getCodigosetor ());
			System.out.println();	
			
			
			for(Profissional p: s.getProfissional()) {
				
				System.out.printf(" Nome profissional:  "+ p.getNome() + " CPF: " + p.getCpf() + " Data nascimento " + p.getDatanascimento () );
								;
				System.out.println();	
			}
			
		}
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////" );
		System.out.println();
		System.out.println();	
		
//////////////////////////////////////////////////////////////objetos de metodos com polimorfismo especificos//////////////////////////////////////////
		
		//Polimorfismo
		System.out.println("/////////////////////////// REGISTRO DE PONTO ///////////////////////////////////////////////" );
		programador.NaoRegistraPonto(true);
		programador.RegistraPonto(false);
		operador.NaoRegistraPonto(false);
		operador.RegistraPonto(true);
		System.out.println( );
		
//////////////////////////////////////////////////////////////objetos de metodos de interface////////////////////////////////////////////////
		
		
		//chamada de metodos da interface
		System.out.println("///////////////////////////PLANILHA FERIAS//////////////////////////////////////////////////" );
		programador.setQuantidadediastrabalho(265);
		programador.setConcedimentoparaferias(true);
		programador.NaoRecebiFerias();
		operador.setQuantidadediastrabalho(365);
		operador.RecebiFerias();

		//RecebiFerias();
		//NaoRecebiFerias();
	}

}
