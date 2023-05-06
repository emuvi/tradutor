package org.coursera.ita;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/service")
public class Service extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String palavra = req.getParameter("palavra");
        req.setAttribute("resultado", Dictionary.traduzir(palavra));
        getServletContext().getRequestDispatcher("/view.jsp").forward(req, resp);
    }

}
