package com.epam.as.textparser.action;

import com.epam.as.textparser.entity.Text;
import com.epam.as.textparser.util.Parser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String reqText = request.getParameter("text");
        Text text = Parser.parseText(reqText);
        request.setAttribute("text", text);
        return "/WEB-INF/output.jsp";
    }
}
