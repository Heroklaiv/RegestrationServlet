package by.my.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/user/login", "/user/reg"})
public class FilterSecurity extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute("currentUser") == null) {
            chain.doFilter(req, res);
        } else {
            System.out.println("попытка несанкционированного входа");
            res.sendRedirect("/");
        }
    }
}