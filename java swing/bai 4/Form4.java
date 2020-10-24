/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Form4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
  
    // class thi sinh
    static class ThiSinh{
        protected String hoTen;
        protected String ngaySinh;
        protected String diaChi;

        public ThiSinh() {
        }

        public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
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

        public String getDiaChi() {
            return diaChi;
        }
        
        // nhap
        public void nhap(Scanner sc){
            System.out.print("Nhap ten: ");
            this.hoTen = sc.nextLine();
            System.out.print("Nhap ngay sinh: ");
            this.ngaySinh = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            this.diaChi = sc.nextLine();

        }
        
        @Override
        public String toString() {
            return "ThiSinh: " + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '\t';
        }     
    }
    
    //khoi a
    static class KhoiA extends ThiSinh{
        protected  float diemToan, diemLy, diemHoa;

        public KhoiA() {
        }

        public KhoiA(float diemToan, float diemLy, float diemHoa, String hoTen, String ngaySinh, String diaChi) {
            super(hoTen, ngaySinh, diaChi);
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;
        }

        public void setDiemToan(float diemToan) {
            this.diemToan = diemToan;
        }

        public void setDiemLy(float diemLy) {
            this.diemLy = diemLy;
        }

        public void setDiemHoa(float diemHoa) {
            this.diemHoa = diemHoa;
        }

        public float getDiemToan() {
            return diemToan;
        }

        public float getDiemLy() {
            return diemLy;
        }

        public float getDiemHoa() {
            return diemHoa;
        }

        @Override
        public String toString() {
            return super.toString() + "KhoiA" + "{" +  "diemToan=" + this.diemToan + ", diemLy=" + this.diemLy + ", diemHoa=" + this.diemHoa +"}";
        }

    }
    
    // khoi c
    static class KhoiC extends ThiSinh{
        protected float diemVan, diemSu, diemDia;
        public KhoiC() {
        }

        public KhoiC(float diemVan, float diemSu, float diemDia, String hoTen, String ngaySinh, String diaChi) {
            super(hoTen, ngaySinh, diaChi);
            this.diemVan = diemVan;
            this.diemSu = diemSu;
            this.diemDia = diemDia;
        }

        public void setDiemVan(float diemVan) {
            this.diemVan = diemVan;
        }

        public void setDiemSu(float diemSu) {
            this.diemSu = diemSu;
        }

        public void setDiemDia(float diemDia) {
            this.diemDia = diemDia;
        }

        public float getDiemVan() {
            return diemVan;
        }

        public float getDiemSu() {
            return diemSu;
        }

        public float getDiemDia() {
            return diemDia;
        }

        @Override
        public String toString() {
            return super.toString() + "KhoiC{" + "diemVan=" + this.diemVan + ", diemSu=" + this.diemSu + ", diemDia=" + this.diemDia + '}';
        }
        
    }
}
