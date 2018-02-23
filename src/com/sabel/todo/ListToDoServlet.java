package com.sabel.todo;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/todo.do")

public class ListToDoServlet extends HttpServlet {

    @Inject
    private ToDoService toDoService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todos", toDoService.retrieveToDos());
        req.getRequestDispatcher("/WEB-INF/views/listTodo.jsp").forward(req, resp);
    }
}
