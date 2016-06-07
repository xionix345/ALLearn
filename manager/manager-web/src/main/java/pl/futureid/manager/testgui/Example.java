package pl.futureid.manager.testgui;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.futureid.manager.test.HelloLocal;

@WebServlet("/example/")
public class Example extends HttpServlet {

	@Inject
	HelloLocal hello;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("test", hello.getHello());
		getServletContext().getRequestDispatcher("/WEB-INF/example.jsp").forward(req, resp);
	}
}
