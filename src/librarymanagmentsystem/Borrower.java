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
public class Borrower extends Person {
    private Date dateofMembership;
    private int numOfBookIssued;
    private int maxBookLimit;
    
    public Borrower(Date dateofMembership,int numOfBookIssued,int maxBookLimit,int id, String name, String emailAddress, String phone) {
        super(id, name, emailAddress, phone);
        this.dateofMembership=dateofMembership;
        this.numOfBookIssued=numOfBookIssued;
        this.maxBookLimit=maxBookLimit;
    }
    
    public void searchItemByTitle()
    {
    }
    public void searchItemByAuthor()
    {
    }
    public void searchItemBysubject()
    {
    }
    public void placingBookOnHold()
    {
    }
    public void viewPersonalInformation()
    {
    }
    
}
