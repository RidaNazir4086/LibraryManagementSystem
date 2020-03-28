/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagmentsystem;
import java.util.*;

/**
 *
 * @author Rida
 */
public class Book {
    
    private int bookId;
    private String title;
    private String auther;
    private String subject;
    
    Book(int bookId, String title, String auther, String subject)
    {
        this.auther=auther;
        this.bookId=bookId;
        this.subject=subject;
        this.title=title;
    }
    
    public void viewBookDetails()
    {
    }
    
    
}
