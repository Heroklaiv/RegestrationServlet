package by.my.servlet;

import by.my.model.User;
import by.my.storage.MessageBar;
import by.my.storage.UserContainer;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/user/login")
@MultipartConfig
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", MessageBar.getMessege());
        MessageBar.setMessege("Enter you Username and Password");
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(username, password);
        if (UserContainer.inspectRegistrationUser(user)) {
            Optional<User> userOptional = UserContainer.getUser(username, password);
            if (userOptional.isEmpty()) {
                getServletContext().getRequestDispatcher("/pages/error.jsp").forward(req, resp);
            } else {
                User user1 = userOptional.get();
                req.getSession().setAttribute("currentUser", user1);
                resp.sendRedirect("/");
            }
        } else {
            req.setAttribute("message", "Wrong password!");
            req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
        }
    }
}
