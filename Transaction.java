/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMProject;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author sr sohan
 */

public class Transaction {
    private  int id;
    private  String type;
    private  String date;
    private  double amount;
    
    private  PreparedStatement st = null;
    private  ResultSet rs;

    public Transaction(int id, String type, String date, double amount) {
        this.rs = null;
        this.id = id;
        this.type = type;
        this.date = date;
        this.amount = amount;
    }
    
    public void update(){
        
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
    
    
}