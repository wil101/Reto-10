package co.udea.edu.reto10.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet{

@Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException{
       Integer numero = 1;
       int factorial = 1;
       int aux = 1;
        try{
            numero = Integer.valueOf(request.getParameter("numero"));
            if (numero < 0) {
                factorial = 0;
            } else {
                factorial = factorial(numero);
            }
        } catch(NumberFormatException e){
            aux = -1;
        }
        if(request.getParameter("numero").isEmpty()){
            aux = 0;
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
           switch (aux) {
               case 0:
                   out.println("<p>El campo no debe quedar vacío </p>");
                   break;
               case -1:
                   out.println("<p>El dato que ingresó no es un número</p>");
                   break;
               default:
                   if (factorial == 0) {
                       out.println("<p>El número ingresado debe ser mayor que cero</p>");
                   }else{
                           out.println("<p>El factorial de " + numero + " es " + factorial + "</p>");
                           }
                   break;
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
