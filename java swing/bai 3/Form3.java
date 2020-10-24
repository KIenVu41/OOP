/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form3;

/**
 *
 * @author Admin
 */
public class Form3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // class person
    static class Person {
    protected  String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String gioitinh;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Person() {
    }

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return  "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }
   
    
}
    // class nhan vien
    static class NhanVien extends Person
{
 private String phongban;
 private double hsl;
 private int thamnien;
 private double luongcb;
 double luongt;
    public NhanVien() {
        super();
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    
    
// hàm tạo

    public NhanVien(String phongban, double hsl, int thamnien, double luongcb, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hsl = hsl;
        this.thamnien = thamnien;
        this.luongcb = luongcb;
    }
    public double tinhluong()
    {
        luongt = luongcb*hsl*(1+thamnien/100);
        return luongt;
    }
    
    @Override
    public String toString() {
        return "NhanVien{"+super.toString() + "phongban=" + phongban + ", hsl=" + hsl + ", thamnien=" + thamnien + ", luongcb=" + luongcb + '}' ;
    }
  
   
}
}
