package com.epam.as.textparser.servlet;

import com.epam.as.textparser.action.Action;
import com.epam.as.textparser.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // super.service(req, resp);

        String actionName = request.getParameter("action");
        Action action = ActionFactory.getAction(actionName);
        String result = action.execute(request);
        request.getRequestDispatcher(result).forward(request, response);
    }
}
