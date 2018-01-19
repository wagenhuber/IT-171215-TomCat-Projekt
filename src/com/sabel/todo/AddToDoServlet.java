package com.sabel.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/addTodo.do")
public class AddToDoServlet extends HttpServlet{

    private ToDoService toDoService = new ToDoService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/addTodo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todoname = req.getParameter("name");
        ToDo neuesToDo = new ToDo(todoname);
        toDoService.add(neuesToDo);
        resp.sendRedirect("/todo.do");
    }
}
