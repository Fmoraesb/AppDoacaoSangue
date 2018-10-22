package negocio;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private float peso;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Pessoa (String nome, String sobrenome, int idade, float peso) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
		this.setPeso(peso);
	}
	
	public Pessoa(String nome, String sobrenome, Endereco endereco) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEndereco(endereco);
	}

	public String exibirDestinatario() {
		if (this.doadorDeSangue()) {
		return String.format("%s. %s", 
				this.obterNomeCompleto(),
				this.getEndereco().imprimir());
		}else {
			return String.format("%s não pode doar sangue", this.obterNomeCompleto());
		}
	}
	
	private boolean doadorDeSangue( ) {
		if ((this.getIdade() >= 18) && (this.getIdade() < 69) && (this.getPeso() >= 50)){
			return true;
		}
			return false;
	}

	private String obterNomeCompleto() {
		
		return String.format("%s %s",
				this.getNome(), 
				this.getSobrenome());
	}

}
