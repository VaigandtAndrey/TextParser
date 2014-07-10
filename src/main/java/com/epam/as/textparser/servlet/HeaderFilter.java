package com.epam.as.textparser.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeaderFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.addHeader("author", "alexey.slepenkov@gmail.com");
        response.addHeader("project", "WEB-TextParser-Task-2");
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, response);
    }

    public void init(FilterConfig filterConfig) {
    }
}
