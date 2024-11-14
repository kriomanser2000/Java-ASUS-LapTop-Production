package com.example.laptopproduction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/laptopInfo")
public class LaptopInfoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String manufacturer = "Asus";
        String country = "Taiwan";
        String employeeCount = "17,000";
        String description = "is an international company based in Taiwan that produces motherboards, video cards, optical drives, PDAs, monitors, laptops, servers, network equipment, mobile phones, computer cases, components, and cooling systems. The company is often referred to by its brand name - ASUS. The company's shares are listed on the London Stock Exchange and the Taiwan Stock Exchange. In 2007, every third PC sold in the world was equipped with an ASUS motherboard. In 2008, the company's turnover amounted to $8.1 billion.";
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ASUS Laptops</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; }");
        out.println("nav { background-color: #333; padding: 10px; }");
        out.println("nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("nav a:hover { text-decoration: underline; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<nav>");
        out.println("<a href='index.jsp'>Main Info</a>");
        out.println("<a href='manufacturerHistory'>History</a>");
        out.println("<a href='news'>News</a>");
        out.println("<a href='laptopModels'>Models</a>");
        out.println("</nav>");
        out.println("<h1>ASUS Laptop Info</h1>");
        out.println("<p><strong>Name: </strong> " + manufacturer + "</p>");
        out.println("<p><strong>Country: </strong> " + country + "</p>");
        out.println("<p><strong>Count employees:</strong> " + employeeCount + "</p>");
        out.println("<p><strong>Small Info: </strong> " + description + "</p>");
        out.println("<p><img src='images/79183.jpg' alt='logo' width='150'/></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
