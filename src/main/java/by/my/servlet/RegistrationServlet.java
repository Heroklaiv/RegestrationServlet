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

@WebServlet("/user/reg")
@MultipartConfig

public class RegistrationServlet extends HttpServlet {
    UserContainer userContainer = new UserContainer();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String password = req.getParameter("password");

        User user = new User(name, username, password, Integer.parseInt(age));

        if (UserContainer.inspectRegistrationUser(user)) {
            MessageBar.setMessege("this user is already registered");
            resp.sendRedirect("/user/login");

        } else {
            userContainer.saveUser(user);
            resp.sendRedirect("/");
        }


    }


}
