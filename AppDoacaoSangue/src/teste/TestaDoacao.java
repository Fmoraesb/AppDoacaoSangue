package teste;

import negocio.Endereco;
import negocio.Pessoa;

public class TestaDoacao {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Moleque", "José", 3, 15);
		Endereco endereco1 = new Endereco("Rua dos Vira-Latas", "23", "", "Campo Grande", "Rio de Janeiro", "RJ", "Brasil");
		pessoa1.setEndereco(endereco1);
		
		System.out.println(pessoa1.exibirDestinatario());
	}
}
