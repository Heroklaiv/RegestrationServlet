package by.my.servlet;

import by.my.model.User;
import by.my.storage.UserContainer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/user/message")
public class MessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> userArrayList = UserContainer.getArrayList();
        req.setAttribute("users", userArrayList);
        getServletContext().getRequestDispatcher("/pages/messege.jsp").forward(req,resp);



    }
}
