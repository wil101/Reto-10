package co.udea.edu.reto10.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NTF")
public class NTFServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>NTFS</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='text-align: center; margin: 40px auto; padding: 40px auto;'>NTFS</h1>");
            out.println("<p style='text-align: justify; margin: 50px;'>Todos "
                    + "los sistemas operativos, en cualquier tipo de dispositivo, cuenta con una unidad de"
                    + "almacenamiento que utiliza para almacenar los archivos, ya "
                    + "sean estos propios del sistema o los archivos del" + "usuario. "
                    + "NFTS viene del inglés 'New Technology File System', que podemos "
                    + "traducir como 'Sistema de archivos de nueva tecnología' y se "
                    + "trata del sistema de archivos que usa la empresa Microsoft "
                    + "en sus sistemas Windows desde hace ya muchos años, desde 2001 "
                    + "exactamente.Como su nombre indica, se trata de una \"Nueva Tecnología\", "
                    + "por lo que está sustituyendo a una tecnología más antigua, "
                    + "que era la FAT32 y las mejoras del sistema NTFS respecto"
                    + " a la anterior son muy importantes. Conforme la tecnología fue avanzando,"
                    + "las necesidades de los usuarios también lo hicieron y en lo referente"
                    + " en la gestión de archivos, los sistemas antiguos tenían algunas"
                    + " restricciones respecto al tamaño de las particiones y de "
                    + "los archivos que era necesarias corregir. El sistema de archivos NTFS "
                    + "fue el elegido por Microsoft desde que lanzó Windows XP en el "
                    + "año 2001 para gestionar sus unidades de almacenamiento del sistema. Con "
                    + "esto se resolvieron algunos de los problemas del sistema antiguo, "
                    + "como poder trabajar con archivos superiores a  4 GB o crear particiones"
                    + " de más de 2 TB. También existen mejoras respecto a la velocidad a la hora de "
                    + "escribir archivos pequeños y los problemas de fragmentación del disco, "
                    + "que tantos dolores de cabeza causaba el sistema FAT32.</p>");
            out.println("<h3 style='margin: 50px; margin-bottom : 20px'>Links</h3>");
            out.println("<ul style=\"margin: 30px;\"><li>"
                    + "<a href=\"https://learn.microsoft.com/es-es/windows-server/storage/file-server/ntfs-overview\""
                    + "style=\"text-decoration: none; color: black;\">Introducción a los NTFS por la pagina de Microsoft</a></li>");
            out.println("<li><a href=\"https://axarnet.es/blog/ntfs\" style=\"text-decoration: "
                    + "none; color: black;\">Qué son y para qué sirven, ventajas e inconvenientes</a></li>");
            out.println("<li><a href=\"https://dinahosting.com/blog/que-es-ntfs/\" style=\"text-decoration: none; "
                    + "color: black;\">Qué es NTFS y cuándo tienes que usarlo como sistema de archivos</a></li>");
            out.println("<li><a href=\"http://mural.uv.es/oshuso/822_tipos_de_sistemas_de_ficheros_en_"
                    + "linux.html#:~:text=Linux%20soporta%20gran%20variedad%20de,"
                    + "utilizado%20para%20compartir%20recursos%20entre\" style=\"text-decoration: "
                    + "none; color: black;\">Sistemas de archivos similares a NTFS para Linux</a></li>");
            out.println("<li><a href=\"https://support.apple.com/es-es/guide/disk-utility/dsku19ed921c/mac\" style=\"text-decoration: "
                    + "none; color: black;\"\">Sistemas de archivos similares a NTFS para Mac</a></li></ul>");
            out.println("<br><br><br><br>");
            out.println("<h3 style='text-align: center; margin: 50px'>Integrantes</h3>");
            out.println("<p style='text-align: center; margin: 50px'>Wilmar Osorio Usuga & Emanuel López Higuita</p>");
            out.println("<p style='text-align: center; margin: 50px'>Monitora te queremos</p>");
            out.println("</body>");
            out.println("</html>");
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
