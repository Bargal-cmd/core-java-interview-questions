import java.io.*;
import java.net.http.HttpResponse;

import javax.servlet.http.*;
import javax.servlet.*;
public class HtppServletdemo extends HttpServlet{
    protected void doGet(Httprequest req , HttpResponse res) throws IOException , ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        HttpSession ss = req.getSession(true);
        Cookies cs = new Cookie("user","Rahul");
        String targetURL="dashboard345";
        cs.setMaxAge(60*60*24);
        res.addCookie(cs);
        String encodeURL = res.encodedURl(targetURl);
        out.print(encodeURL);
    }


    

}