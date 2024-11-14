package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/newsDetail")
public class NewsDetailServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String newsId = req.getParameter("id");
        out.println("<html><head><title>News Detail</title><style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println(".content { margin: 20px; }");
        out.println(".gallery img { width: 200px; margin: 10px; }");
        out.println("</style></head><body>");
        out.println("<nav><a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='#'>Models</a></nav>");
        if ("1".equals(newsId))
        {
            out.println("<h1>New Asus Laptop Released</h1>");
            out.println("<p>Asus has unveiled its latest gaming laptop, featuring top-of-the-line specs and a sleek design...</p>");
            out.println("<div class='gallery'>");
            out.println("<img src='images/asus_gaming_laptop.jpg' alt='New Asus Laptop'>");
            out.println("</div>");
        }
        else if ("2".equals(newsId))
        {
            out.println("<h1>Asus Expands Production</h1>");
            out.println("<p>Asus has announced its plans to expand production facilities around the world to meet increasing demand...</p>");
            out.println("<div class='gallery'>");
            out.println("<img src='images/asus_factory_expansion.jpg' alt='Asus Factory Expansion'>");
            out.println("</div>");
        }
        out.println("<a href='news'>Back to News</a>");
        out.println("</body></html>");
    }
}
