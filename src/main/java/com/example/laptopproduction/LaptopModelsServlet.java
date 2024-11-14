package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/laptopModels")
public class LaptopModelsServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Laptop Models</title><style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println(".model-item { margin: 20px; padding: 10px; border-bottom: 1px solid #ddd; display: flex; align-items: center; }");
        out.println(".model-item img { width: 150px; height: auto; margin-right: 20px; }");
        out.println("</style></head><body>");
        out.println("<nav><a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='laptopModels'>Models</a></nav>");
        out.println("<h1>Laptop Models</h1>");
        out.println("<div class='model-item'><img src='images/rog_zephyrus.jpg' alt='ROG Zephyrus'>");
        out.println("<div><h2><a href='laptopDetail?model=zephyrus'>ROG Zephyrus</a></h2>");
        out.println("<p>A high-performance gaming laptop with powerful hardware, sleek design, and enhanced cooling.</p></div></div>");
        out.println("<div class='model-item'><img src='images/vivobook_s15.jpg' alt='VivoBook S15'>");
        out.println("<div><h2><a href='laptopDetail?model=vivobook'>VivoBook S15</a></h2>");
        out.println("<p>An ultra-thin, lightweight laptop designed for productivity and portability, with vibrant display options.</p></div></div>");
        out.println("<div class='model-item'><img src='images/zenbook_pro.jpg' alt='ZenBook Pro'>");
        out.println("<div><h2>ZenBook Pro</h2>");
        out.println("<p>A laptop built for creative professionals, featuring a stunning display and top-notch performance.</p></div></div>");
        out.println("</body></html>");
    }
}
