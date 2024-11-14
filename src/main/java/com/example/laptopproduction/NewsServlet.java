package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/news")
public class NewsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>News</title><style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println(".news-item { margin: 20px; padding: 10px; border-bottom: 1px solid #ddd; }");
        out.println("</style></head><body>");
        out.println("<nav><a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='#'>Models</a></nav>");
        out.println("<h1>News</h1>");
        out.println("<div class='news-item'><h2>New Asus Laptop Released</h2>");
        out.println("<p>Asus has released a new gaming laptop with high-end specs...</p>");
        out.println("<a href='newsDetail?id=1'>Read more</a></div>");
        out.println("<div class='news-item'><h2>Asus Expands Production</h2>");
        out.println("<p>Asus announces plans to expand production facilities globally...</p>");
        out.println("<a href='newsDetail?id=2'>Read more</a></div>");
        out.println("</body></html>");
    }
}
