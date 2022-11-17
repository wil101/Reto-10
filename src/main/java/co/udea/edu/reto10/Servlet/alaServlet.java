package co.udea.edu.reto10.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class alaServlet extends HttpServlet{

@Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException{
       Integer numero;
        if(request.getParameter("numero").isEmpty()){
            numero = 0;
        } else if(request.getParameter("numero").getClass().toString().compareTo("class java.lang.Integer") != 0){
            numero = -10;
        }
        else{
            numero = Integer.valueOf(request.getParameter("numero"));
        }
        int factorial;
        if(numero < 0){
            factorial = 0;
        } else{
            factorial = factorial(numero);
        }
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>factorial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado</h1>");
            if(numero < 0){
                out.println("<p>El número ingresado debe ser mayor que cero</p>");
            } else if (numero == 0) {
                out.println("<p>El campo no debe quedar vacío </p>");
            }else{
                out.println("<p>El factorial de " + numero + " es " + factorial + "</p>");
            }
            out.println("</body>");
            out.println("</html>");
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public int factorial(int num){
        if(num == 0){
            return 1;
        } else{
            return num * factorial(num - 1);
        }
    }
}
