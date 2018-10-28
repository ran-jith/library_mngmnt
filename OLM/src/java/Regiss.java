import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Regiss extends HttpServlet {

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
            String n = req.getParameter("hnum");
            ArrayList al = null;
            ArrayList book_list = new ArrayList();
            String query = "select *from book where bno='"+n+"' ";
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                al = new ArrayList();
                al.add(rs.getString(3));
                al.add(rs.getString(5));
                book_list.add(al);
            }
            req.setAttribute("bklist", book_list);
            RequestDispatcher view = req.getRequestDispatcher("regis.jsp");
            view.forward(req, res);
            conn.close();
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | ServletException e) {
            out.print(e);
            e.printStackTrace();
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
