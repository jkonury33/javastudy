package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        
        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<title>입력 화면</title>");
        out.println("<head>");
        out.println("<body>");
        out.println("<form action='add' method='post'>");
        out.println("<input type='text' name='name' id='name' placeholder='이름' /> <br/>");
        out.println("<input type='password' name='password' id='password' placeholder='비밀번호' /><br/>");
        out.println("<input type='submit' value='로그인' />");
        out.println("<input type='reset' value='다시입력' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</head>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }
    

}
