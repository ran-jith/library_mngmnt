import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Display2 extends HttpServlet {
 
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //doGet(req,res);
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
            
 
            ArrayList al = null;
            ArrayList book_list = new ArrayList();
            String query = "select * from book";
 
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
 
            while (rs.next()) {
                al = new ArrayList();
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getInt(3));
                al.add(rs.getString(4));
                al.add(rs.getInt(5));
 
               // System.out.println("al :: " + al);
                book_list.add(al);
            }
 
            req.setAttribute("bklist", book_list);
            RequestDispatcher view = req.getRequestDispatcher("/book/disp2.jsp");
            view.forward(req, res);
            conn.close();
            System.out.println("Disconnected!");
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | ServletException e) {
            System.out.print(e);
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