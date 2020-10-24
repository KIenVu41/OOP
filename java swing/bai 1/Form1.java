/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form1;

import java.util.Date;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Form1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    // class sinh vien
    public class SinhVienN02 implements Serializable{
        protected String maSV;
        protected String hoTen;
        protected Date ngaySinh;
        protected String gioiTinh;
        protected Float diemTB;

        public SinhVienN02() {
        }

        public SinhVienN02(String maSV, String hoTen, Date ngaySinh, String gioiTinh, Float diemTB) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.gioiTinh = gioiTinh;
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

        public Date getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(Date ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public Float getDiemTB() {
            return diemTB;
        }

        public void setDiemTB(Float diemTB) {
            this.diemTB = diemTB;
        }

        @Override
        public String toString() {
            return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTB=" + diemTB + '}';
        }
    }
    
    // class sinh vien htn
    public static class SinhVienHTN02 extends SinhVienN02{
        private Float luong;

        public SinhVienHTN02() {
            super();
        }

        public SinhVienHTN02(Float hocPhi, String maSV, String hoTen, Date ngaySinh, String gioiTinh, Float diemTB) {
            super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
            this.luong = hocPhi;
        }

        public void setLuong(Float luong) {
            this.luong = luong;
        }

        public Float getLuong() {
            return luong;
        }

        @Override
        public String toString() {
            return "SinhVienHTN02{" + "luong=" + luong + '}';
        }
   
}
    
    // class sinh vien mat ma
    public static class SinhVienMMN02 extends SinhVienN02{
        private String donVi;
        private Float hocPhi;

        public SinhVienMMN02() {
            super();
        }

        public SinhVienMMN02(String donVi, Float hocPhi, String maSV, String hoTen, Date ngaySinh, String gioiTinh, Float diemTB) {
            super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
            this.donVi = donVi;
            this.hocPhi = hocPhi;
        }

        public void setDonVi(String donVi) {
            this.donVi = donVi;
        }

        public void setHocPhi(Float hocPhi) {
            this.hocPhi = hocPhi;
        }

        public String getDonVi() {
            return donVi;
        }

        public Float getHocPhi() {
            return hocPhi;
        }

        @Override
        public String toString() {
            return "SinhVienMMN02{" + "donVi=" + donVi + ", hocPhi=" + hocPhi + '}';
        }
        
    }
}
