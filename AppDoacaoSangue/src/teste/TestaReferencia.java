package teste;

import negocio.Endereco;
import negocio.Pessoa;

public class TestaReferencia {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Moleque", "José", 3, 15);
		Endereco endereco1 = new Endereco("Rua dos Vira-Latas", "23", "", "Campo Grande", "Rio de Janeiro", "RJ",
				"Brasil");
		p1.setEndereco(endereco1);
		
		System.out.printf("%s %s - %.2f\n",p1.getNome(),
				p1.getSobrenome(),
				p1.getPeso() + 2);
		
		/*Pessoa p2 = p1;
		p1.setIdade(p1.getIdade() + 1);
		
		System.out.printf("%d", p2.getIdade());
		*/
	}
}