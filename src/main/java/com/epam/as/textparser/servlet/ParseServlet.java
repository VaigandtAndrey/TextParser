package com.epam.as.textparser.servlet;

import com.epam.as.textparser.util.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // super.service(req, resp);
        response.addHeader("author", "alexey.slepenkov@gmail.com");
        request.setCharacterEncoding("UTF-8");

        String text = request.getParameter("textarea");
        request.setAttribute("text", Parser.parseText(text));
        request.setAttribute("paragraph", Parser.parseParagraphs(text));
        request.setAttribute("sentence", Parser.parseSentences(text));
        request.setAttribute("word", Parser.parseWords(text));
        request.setAttribute("letter", Parser.parseLetters(text));//

        request.getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);
    }
}
