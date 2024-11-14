package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/manufacturerHistory")
public class ManufacturerHistoryServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>History of ASUS</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println(".content { margin: 20px; }");
        out.println(".gallery img { width: 200px; margin: 10px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<nav>");
        out.println("<a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='laptopModels'>Models</a>");
        out.println("</nav>");
        out.println("<div class='content'>");
        out.println("<h1>History of Asus</h1>");
        out.println("<p>ASUS was founded in 1989 in Taipei, Taiwan. Since its inception, the company has achieved success through innovation in computer hardware and electronics.</p>");
        out.println("<p>ASUS was the first company on the market to introduce a new generation of motherboards. Today, ASUS is an international leader in the development of laptops and computer equipment.</p>");
        out.println("<div class='gallery'>");
        out.println("<img src='images/asus_founders.jpg' alt='Founders ASUS'>");
        out.println("<img src='images/asus_factory.jpg' alt='Factory ASUS'>");
        out.println("<img src='images/asus_products.jpg' alt='Products ASUS'>");
        out.println("</div>");
        out.println("<p>Learn more about the history of ASUS at <a href='https://www.asus.com/about-asus/' target='_blank'>official ASUS website</a>.</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
