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
 
public class AddBook extends HttpServlet {
 
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "olm";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
 
        Statement st;
        try {
            Class.forName(driver).newInstance();
           Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected!");
            String jname = req.getParameter("bname");
            String jauthor = req.getParameter("bauthor");
            String jcat = req.getParameter("cat");
            int jcopy = Integer.parseInt(req.getParameter("cop"));
            int jnum = Integer.parseInt(req.getParameter("bnum"));
            String query = "Insert into book(bname,author,bno,category,copies) values('"+jname+"','"+jauthor+"','"+jnum+"','"+jcat+"','"+jcopy+"')";
            st = conn.createStatement();
            st.executeUpdate(query);
            
           
       
           out.println("Successfully inserted");
            conn.close();
            System.out.println("Disconnected!");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            out.print(e);
            e.printStackTrace();
        }
    }
 
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
