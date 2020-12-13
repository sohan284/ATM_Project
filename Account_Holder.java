/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author sr sohan
 */
public class Account_Holder {
    
    private  String userName;
    private String password;
    private String user="";
    private String pass="";
    
    //private final Connection conn = DBConnect.connectDB();
    private PreparedStatement st = null;
    private ResultSet rs = null;

    public Account_Holder(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

   

    public boolean login() throws SQLException {

        checkUser();
        return userName.equals(user) && password.equals(pass);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private void checkUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
