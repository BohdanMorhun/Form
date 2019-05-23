import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name = "Servlet", urlPatterns = {"/question"})
public class Servlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Form</title></head>" +
            "<body><p>%s</p></body></html>";

    private static AtomicInteger answer1Yes = new AtomicInteger(0);
    private static AtomicInteger answer1No = new AtomicInteger(0);

    private static AtomicInteger answer2Yes = new AtomicInteger(0);
    private static AtomicInteger answer2No = new AtomicInteger(0);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String answer1 = req.getParameter("question1");
        final String answer2 = req.getParameter("question2");

        if ( answer1.equals("yes") ) {
            answer1Yes.incrementAndGet();
        } else {
            answer1No.incrementAndGet();
        }

        if ( answer2.equals("yes") ) {
            answer2Yes.incrementAndGet();
        } else {
            answer2No.incrementAndGet();
        }

        String res = "<table border =1>" +
                "<tr><td>Question_Do you like...</td><td>Yes</td><td>No</td></tr>" +
                "<tr><td>question1</td><td>" + answer1Yes +"</td><td> " + answer1No +"</td></tr>"+
                "<tr><td>question2</td><td>" + answer2Yes +"</td><td> " + answer2No +"</td></tr>"+
                "</table>";

        resp.getWriter().println(String.format(TEMPLATE, res));
    }
}
