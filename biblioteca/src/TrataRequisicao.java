
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TrataRequisicao
 */
@WebServlet({ "/TrataRequisicao", "/processa" })
public class TrataRequisicao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TrataRequisicao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession sessao = request.getSession();

		RequestDispatcher despachante = request
				.getRequestDispatcher("saida.jsp");

		String usuario = request.getParameter("nmusuario");
		String senha = request.getParameter("nmsenha");

		if (usuario.equals("admin") && senha.equals("admin123")) {
			// incluir aqui a validacao com sucesso do usuario
			sessao.setAttribute("attrMensagem", "Usuário logado com sucesso");

		} else {
			// INcluir o codigo de insucesso de login
			sessao.setAttribute("attrMensagem", "Usuário o senha inválida!");
		}
		
		despachante.forward(request, response);

	}

}
