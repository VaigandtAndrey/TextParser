package com.epam.as.textparser.action;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String reqText = request.getParameter("text");
       // Text text = Parser.parseText(reqText);
       // request.setAttribute("text", text);
        return "/WEB-INF/output.jsp";
    }
}
