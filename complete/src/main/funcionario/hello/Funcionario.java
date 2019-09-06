package hello;
/**
 *  @author Alexandre Florentino 
 *  @since 06/09/2019
 *  @version 1.0
 */
public class Funcionario {
	
	private Long id;
	private String nome;
	
	public Funcionario(Long id, String nome) {		
		this.id = id;
		this.nome = nome;				
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
