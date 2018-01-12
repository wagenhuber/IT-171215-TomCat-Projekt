package com.sabel.login;

import com.sabel.todo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Anutation unter welcher Tomcat erreichbar ist - siehe web.xml
@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();
    private ToDoService toDoService = new ToDoService();

    //Daten an Webserver via GET übergeben
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Weiterleitung
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);


    }

    //Daten an Webserver via POST übergeben
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String pass = req.getParameter("password");

        if (loginService.checkPassword(name, pass)){
            req.setAttribute("name", req.getParameter("name"));
            req.getSession().setAttribute("name", name);
            resp.sendRedirect("/todo.do");
        } else {
            req.setAttribute("errorMessage", "login nicht erfolgreich");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
        }

    }
}
