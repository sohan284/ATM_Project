/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMProject;

/**
 *
 * @author sr sohan
 */

    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Accounts {
    private int id;
    private String accNumber;
    private double balance;
    
  
    private PreparedStatement st = null;
    private ResultSet rs= null;

    public Accounts(int id, String accNumber, double balance) {
        this.id = id;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    
    
    public int getId() {
        return id;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
    
    
    
}

    