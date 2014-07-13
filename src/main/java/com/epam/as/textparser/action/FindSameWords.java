package com.epam.as.textparser.action;

import com.epam.as.textparser.entity.Paragraph;
import com.epam.as.textparser.entity.Sentence;
import com.epam.as.textparser.entity.Text;
import com.epam.as.textparser.parser.RegExParser;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class FindSameWords implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        String reqText = request.getParameter("text");
        RegExParser parser = new RegExParser();
        Text txt = parser.parseText(parser.clean(reqText));
        List<Sentence> result = new ArrayList<>();

        for (Paragraph pars : txt.getAllElements()) {
            for (Sentence sents : pars.getAllElements()) {

            }
        }


        request.setAttribute("result", result);
        return "/WEB-INF/output.jsp";
    }
}
