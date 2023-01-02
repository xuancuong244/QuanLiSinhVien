/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controller.Grade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongNX
 */
public class DAOMarkStudent {

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
    public void LoadAllData(ArrayList<Grade> list) {
        conn = getConnection(url, user, pass);
        if (conn != null) {
            String sql = "select ID, "
                    + "STUDENTS.MASV, "
                    + "HoTen,"
                    + "Email,"
                    + "SDT ,"
                    + "GioiTinh,"
                    + "DiaChi,"
                    + "Hinh,"
                    + "Tienganh,"
                    + "TinHoc,"
                    + "GDTC from GRADE join STUDENTS on STUDENTS.MASV = GRADE.MASV where 1 = 1 ";
            try {
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Grade chk = new Grade();
//                    chk.setID(rs.getString(1));
                    chk.setMaSV(rs.getString(2));
                    chk.setHoTen(rs.getString(3));
                    chk.setDiemTA(rs.getInt(9));
                    chk.setDiemTH(rs.getInt(10));
                    chk.setDiemGDTC(rs.getInt(11));
                    chk.setDiemTB(Math.round(((double) ((rs.getInt(9) + rs.getInt(10) + rs.getInt(11))) / 3) * 10.0) / 10.0);
                    list.add(chk);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } else {
//            JOptionPane.showMessageDialog(null, "Ket noi that bai!!");
            System.out.println("Ket noi that bai");
        }
    }
}
