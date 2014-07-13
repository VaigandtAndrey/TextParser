package com.epam.as.textparser.action;

import com.epam.as.textparser.entity.Paragraph;
import com.epam.as.textparser.entity.Sentence;
import com.epam.as.textparser.entity.Text;
import com.epam.as.textparser.parser.RegExParser;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBySentenceLength implements Action {

    @Override
    public String execute(HttpServletRequest request) {

        String reqText = request.getParameter("text");
        RegExParser parser = new RegExParser();
        Text txt = parser.parseText(parser.clean(reqText));
        List<Sentence> result = new ArrayList<>();
        for (Paragraph paragraph : txt.getAllElements()) {
            for (Sentence sentence : paragraph.getAllElements()) {
                result.add(sentence);
            }
        }
        Collections.sort(result, (o1, o2) -> o1.getAllElements().size() > o2.getAllElements().size()?1:-1                  );
        request.setAttribute("result", result);
        request.setAttribute("text", txt);
        return "/WEB-INF/output.jsp";
    }

}
