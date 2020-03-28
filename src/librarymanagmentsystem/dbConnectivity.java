/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagmentsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;s
/**
 *
 * @author Rida
 */
public class dbConnectivity {
    
    public Connection con;
    public Statement stmt;
    
    dbConnectivity() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://localhost\\farwabatool:1433;databaseName=lab5";
             con=DriverManager.getConnection(s,"new_user","123");


            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    ArrayList<Books> currentlyBorrowedBooks(int borrowerId)
    {
        ArrayList<Books> bookList=new ArrayList<Books>(); 
        Books book=null;
        try {
            ResultSet rs=stmt.executeQuery("select BookId from  LoanBook1 where borrwerId="+borrowerId";");
        } catch (SQLException ex) {
            Logger.getLogger(dbConnectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(rs.next())
        {
            int
        }
    }
}
