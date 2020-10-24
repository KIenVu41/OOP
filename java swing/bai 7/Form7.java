/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form7;

/**
 *
 * @author Admin
 */
public class Form7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // class person
    static class Person{
        protected String hoTen;
        protected String ngaySinh;
        protected String gioiTinh;
        protected String diaChi;

        public Person() {
        }

        public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        @Override
        public String toString() {
            return "Person{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + '}' + "\t";
        }
        
    }
    
    // class nhan vien
    static class NhanVien extends Person{
        private String phong;
        private float hsl;
        private int thamNien;
        private float luongCb;
        private float luongt;
        public NhanVien() {
        }

        public NhanVien(String phong, float hsl, int thamNien, float luongCb, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
            super(hoTen, ngaySinh, gioiTinh, diaChi);
            this.phong = phong;
            this.hsl = hsl;
            this.thamNien = thamNien;
            this.luongCb = luongCb;
        }

        public void setPhong(String phong) {
            this.phong = phong;
        }

        public void setHsl(float hsl) {
            this.hsl = hsl;
        }

        public void setThamNien(int thamNien) {
            this.thamNien = thamNien;
        }

        public void setLuongCb(float luongCb) {
            this.luongCb = luongCb;
        }

        public String getPhong() {
            return phong;
        }

        public float getHsl() {
            return hsl;
        }

        public int getThamNien() {
            return thamNien;
        }

        public float getLuongCb() {
            return luongCb;
        }
        
        public float tinhluong()
            {
                luongt = luongCb*hsl*(1+thamNien/100);
                return luongt;
            }

        @Override
        public String toString() {
            return super.toString() + "NhanVien{" + "phong=" + phong + ", hsl=" + hsl + ", thamNien=" + thamNien + ", luongCb=" + luongCb + ", luongt=" + luongt + '}';
        }
        
    }
}
