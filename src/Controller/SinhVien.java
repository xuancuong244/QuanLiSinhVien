package Controller;

public class SinhVien {

        String Masv;
        String Hoten;
        String Email;
        String SoDT;
        boolean GioiTinh;
        String Diachi;
        String hinh;
        

    public SinhVien() {
    }

    public SinhVien(String Masv, String Hoten, String Email, String SoDT, boolean GioiTinh, String Diachi, String hinh) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SoDT = SoDT;
        this.GioiTinh = GioiTinh;
        this.Diachi = Diachi;
        this.hinh = hinh;
    }
    
    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    
    
    

}
