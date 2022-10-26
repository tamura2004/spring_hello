import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/test03","/test05" })
public class test03 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req,
      HttpServletResponse res)
      throws ServletException, IOException {

    res.setContentType("text/html; charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("");
    out.println("");
    out.printf("context path = %s<br>", req.getContextPath());
    out.printf("request uri = %s<br>", req.getRequestURI());
    out.printf("request url = %s<br>", req.getRequestURL());
    System.out.printf("context path = %s\n", req.getContextPath());
    System.out.printf("request uri = %s\n", req.getRequestURI());
    System.out.printf("request url = %s\n", req.getRequestURL());
    out.println("");
    out.println("");

    out.close();

  }
}
