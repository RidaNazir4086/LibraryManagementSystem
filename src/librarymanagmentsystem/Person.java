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
public class Person {
    private String name;
    private int id;
    private String emailAddress;
    private String PhoneNo;
    Person(int id,String name, String emailAddress,String phone)
    {
        this.id=id;
        this.name=name;
        this.emailAddress=emailAddress;
        this.PhoneNo=phone;
    }
    
    
}
