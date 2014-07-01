package com.epam.as.textparser.servlet;

import com.epam.as.textparser.util.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParseServlet extends HttpServlet {

    //TODO !!!!!!!!!!!!!!!!!!! <

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // super.service(req, resp);
        response.addHeader("author", "alexey.slepenkov@gmail.com");
        String text = request.getParameter("textarea");
        Parser textParser=new Parser(text);
        String[] sentences = textParser.parseSentences();

        request.setAttribute("text", textParser.getSubmittedText());
        request.setAttribute("sentences", sentences);
        request.getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);
    }
}
