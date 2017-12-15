package com.sabel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Anutation unter welcher Tomcat erreichbar ist
@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req ist das angefragte Objekt
        req.setAttribute("name", req.getParameter("name"));
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);


    }



}
