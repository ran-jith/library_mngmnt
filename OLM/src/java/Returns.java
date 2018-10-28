import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Date;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Returns extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "olm";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "password123";
        Statement st;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected!");
            String jid = req.getParameter("bno");
            String sid = req.getParameter("sid");
            String query = "update book set copies = copies+1 where bno = '"+jid+"'";
            String query2 = "Delete from register where student_id = '"+sid+"' and bno='"+jid+"'";
            st = conn.createStatement();
            st.executeUpdate(query);
            st.executeUpdate(query2);
            out.println("Successfully Returned");
            conn.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
           out.print(e);
            e.printStackTrace();
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
