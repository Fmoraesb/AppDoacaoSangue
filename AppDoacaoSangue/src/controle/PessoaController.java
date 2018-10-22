package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Endereco;
import negocio.Pessoa;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/PessoaController")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PessoaController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pessoa p1 = new Pessoa(
				request.getParameter("nome"), 
				request.getParameter("sobrenome"), 
				Integer.valueOf(request.getParameter("idade")), 
				Float.valueOf(request.getParameter("peso")));
		
		Endereco endereco1 = new Endereco(request.getParameter("logradouro"),
				request.getParameter("numero"),
				request.getParameter("complemento"),
				request.getParameter("bairro"),
				request.getParameter("municipio"),
				request.getParameter("estado"),
				request.getParameter("pais"));
		p1.setEndereco(endereco1);

		System.out.println(p1.exibirDestinatario());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
