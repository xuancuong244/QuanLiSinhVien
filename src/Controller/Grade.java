package Controller;

public class Grade {
    private String maSV;
    private String hoTen;
    private int diemTA;
    private int diemTH;
    private int diemGDTC;
    private double diemTB;

    public Grade() {
    }

    public Grade( String maSV, String hoTen, int diemTA, int diemTH, int diemGDTC, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTA = diemTA;
        this.diemTH = diemTH;
        this.diemGDTC = diemGDTC;
        this.diemTB = diemTB;
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(int diemTA) {
        this.diemTA = diemTA;
    }

    public int getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(int diemTH) {
        this.diemTH = diemTH;
    }

    public int getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(int diemGDTC) {
        this.diemGDTC = diemGDTC;
    }

    public double getDiemTB() {
        return (diemTA + diemTH + diemGDTC ) / 3;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    

    
}
