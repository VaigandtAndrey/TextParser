package com.epam.as.textparser.action;

import com.epam.as.textparser.entity.Text;
import com.epam.as.textparser.parser.RegExParser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String reqText = request.getParameter("text");
        RegExParser parser = new RegExParser();
        Text txt = parser.parseText(parser.clean(reqText));
        request.setAttribute("text", txt);
        return "/WEB-INF/output.jsp";
    }
}
