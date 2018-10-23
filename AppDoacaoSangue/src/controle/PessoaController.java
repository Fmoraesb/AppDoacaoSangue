package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Endereco;
import negocio.Pessoa;

@WebServlet("/PessoaController")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Pessoa> pessoas;

	public PessoaController() {
		pessoas = new ArrayList<Pessoa>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Pessoa p1 = new Pessoa(request.getParameter("nome"), request.getParameter("sobrenome"),
				Integer.parseInt(request.getParameter("idade")), Float.parseFloat(request.getParameter("peso")));

		Endereco endereco1 = new Endereco(request.getParameter("logradouro"), request.getParameter("numero"),
				request.getParameter("complemento"), request.getParameter("bairro"), request.getParameter("municipio"),
				request.getParameter("estado"), request.getParameter("pais"));
		p1.setEndereco(endereco1);
		pessoas.add(p1);
		System.out.println("Quantidade de Pessoas: " + pessoas.size());
		System.out.println(p1.toString());

		request.getRequestDispatcher("index.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		if (pessoas.isEmpty()) {
			out.println("Não existem pessoas cadastradas");
		} else {
			for (Pessoa pessoa : pessoas) {
				out.println("<h4>" + pessoa.toString() + "</h4>");
			}
		}
		doGet(request, response);

	}
}
