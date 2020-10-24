/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Form2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    // class person
    public class Person{
        protected String ten, ngaySinh, diaChi, gioiTinh;

        public Person(String ten, String ngaySinh, String diaChi, String gioiTinh) {
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.gioiTinh = gioiTinh;
        }

        public Person() {
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getTen() {
            return ten;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        @Override
        public String toString() {
            return "Person{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
        }
        
    }
    
    // class student
    static class Student extends Person{
        private String maSV, email;
        private float diemTK;
        ArrayList<Student> dsts = new ArrayList<>();
        public Student() {
        }

        public Student(String maSV, String email, float diemTK, String ten, String ngaySinh, String diaChi, String gioiTinh) {
            super(ten, ngaySinh, diaChi, gioiTinh);
            this.maSV = maSV;
            this.email = email;
            this.diemTK = diemTK;
        }

        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setDiemTK(float diemTK) {
            this.diemTK = diemTK;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getEmail() {
            return email;
        }

        public float getDiemTK() {
            return diemTK;
        }

        @Override
        public String toString() {
            return "Student{" + "maSV=" + maSV + ", email=" + email + ", diemTK=" + diemTK + '}';
        }
        
    }
}
