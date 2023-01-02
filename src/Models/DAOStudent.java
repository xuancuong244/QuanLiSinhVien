/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controller.CheckStudent;
import Controller.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CuongNX
 */
public class DAOStudent {
    Connection conn = null;
    String url = "jdbc:sqlserver://localhost:1433;database=PS21684_ASM;userName=sa;password =123";
    String user = "sa";
    String pass = "123";
    
    public Connection getConnection(String url, String user, String pass) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    // load all tu sql
    public void LoadAllData(ArrayList<CheckStudent> list) {
        conn = getConnection(url, user, pass);
        if (conn != null) {
            String sql = "select * from STUDENTS";
            try {
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next()){
                    CheckStudent chk = new CheckStudent();
                    chk.setIDStudent(rs.getString(1));
                    chk.setFullname(rs.getString(2));
                    chk.setEmail(rs.getString(3));
                    chk.setPhone(rs.getString(4));
                    chk.setGender(rs.getBoolean(5));
                    chk.setAddress(rs.getString(6)); 
                    chk.setImage(rs.getString(7));
                    list.add(chk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAOStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
//            JOptionPane.showMessageDialog(null, "Ket noi that bai!!");
            System.out.println("Ket noi that bai");
        }
    }
   

}
