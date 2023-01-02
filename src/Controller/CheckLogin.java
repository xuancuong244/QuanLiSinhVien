package Controller;

import Models.DataConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import View.ManageMarkStudent;
import View.ManageStudent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class CheckLogin {
    
    private JOptionPane pane;
    private JTextField txtUser;
    private JTextField txtPass;
    private JLabel jblError;
    private int role;

    public CheckLogin() {
    }

    public CheckLogin(JTextField txtUser, JTextField txtPass, JLabel jblError, int role) {
        this.txtUser = txtUser;
        this.txtPass = txtPass;
        this.jblError = jblError;
        this.role = role;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public JTextField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JTextField txtPass) {
        this.txtPass = txtPass;
    }

    public JLabel getJblError() {
        return jblError;
    }

    public void setJblError(JLabel jblError) {
        this.jblError = jblError;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean check() {
        if (txtUser.getText().trim().equals("")) {
            jblError.setText("User invalid!");
            jblError.setVisible(true);
            txtUser.requestFocus();
            return false;
        } else {
            if (txtPass.getText().trim().equals("")) {
                jblError.setText("Password invalid!");
                jblError.setVisible(true);
                txtPass.requestFocus();
                return false;
            } else {
                int a = 0;
                try {
                    String sql = "select * from USERS";
                    Connection con = DataConnection.getConnection();
                    PreparedStatement prst = con.prepareStatement(sql);
                    ResultSet rs = prst.executeQuery();
                    while (rs.next()) {
                        if (rs.getString(1).equals(txtUser.getText()) && rs.getString(2).equals(txtPass.getText())) {
                            a++;
                            if (rs.getString(3).equals("GiangVien")) {
                                role = 1;
                                JOptionPane.showMessageDialog(pane, "Login succesfully!");
                                ManageMarkStudent ms = new ManageMarkStudent();
                                ms.setVisible(true);
                            } else {
                                role = 2;
                                JOptionPane.showMessageDialog(pane, "Login succesfully!");
                                ManageStudent mt = new ManageStudent();
                                mt.setVisible(true);
                            }
                            jblError.setVisible(false);
                            return true;
                        }
                    }
                    con.close();
                    prst.close();
                    if (a == 0) {
                        jblError.setText("User or password invalid!");
                        jblError.setVisible(true);
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        return true;
    }

}
