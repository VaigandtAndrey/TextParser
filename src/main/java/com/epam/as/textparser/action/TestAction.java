package com.epam.as.textparser.action;

import javax.servlet.http.HttpServletRequest;


public class TestAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String reqText = request.getParameter("text");
       // String[] text = Parser.test(reqText);
       // request.setAttribute("text", Arrays.toString(text));
        return "/WEB-INF/output.jsp";
    }
}
