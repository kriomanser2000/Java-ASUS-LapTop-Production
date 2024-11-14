package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/laptopDetail")
public class LaptopModelDetailServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String model = req.getParameter("model");
        out.println("<html><head><title>Laptop Details</title><style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println(".gallery img { width: 200px; margin: 10px; }");
        out.println("</style></head><body>");
        out.println("<nav><a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='laptopModels'>Models</a></nav>");
        if ("zephyrus".equalsIgnoreCase(model))
        {
            out.println("<h1>ROG Zephyrus</h1>");
            out.println("<p>A high-performance gaming laptop designed for enthusiasts, with a sleek design and advanced cooling technology.</p>");
            out.println("<div class='gallery'>");
            out.println("<img src='images/rog_zephyrus_1.jpg' alt='ROG Zephyrus View 1'>");
            out.println("<img src='images/rog_zephyrus_2.jpg' alt='ROG Zephyrus View 2'>");
            out.println("<img src='images/rog_zephyrus_3.jpg' alt='ROG Zephyrus View 3'>");
            out.println("</div>");
        }
        else if ("vivobook".equalsIgnoreCase(model))
        {
            out.println("<h1>VivoBook S15</h1>");
            out.println("<p>A lightweight, portable laptop ideal for students and professionals, with vibrant color options and a durable build.</p>");
            out.println("<div class='gallery'>");
            out.println("<img src='images/vivobook_s15_1.jpg' alt='VivoBook S15 View 1'>");
            out.println("<img src='images/vivobook_s15_2.jpg' alt='VivoBook S15 View 2'>");
            out.println("<img src='images/vivobook_s15_3.jpg' alt='VivoBook S15 View 3'>");
            out.println("</div>");
        }
        else
        {
            out.println("<h1>Unknown Model</h1>");
            out.println("<p>No details are available for this model.</p>");
        }
        out.println("<p><a href='laptopModels'>Back to Models</a></p>");
        out.println("</body></html>");
    }
}
