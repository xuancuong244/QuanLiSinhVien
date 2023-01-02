/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author CuongNX
 */
public class CheckStudent {
    String IDStudent, Fullname, Email, Address, Image;
    String phone;
    boolean Gender;

    public CheckStudent() {
    }

    public CheckStudent(String IDStudent, String Fullname, String Email, String phone, String Address, boolean Gender, String Image) {
        this.IDStudent = IDStudent;
        this.Fullname = Fullname;
        this.Email = Email;
        this.phone = phone;
        this.Address = Address;
        this.Gender = Gender;
        this.Image = Image;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
    
    
}
