/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form5;

/**
 *
 * @author Admin
 */
public class Form5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // class giang vien
    static class GiangVien{
        protected String hoTen;
        protected String maGV;
        protected String diaChi;
        protected String gioiTinh;
        protected String khoa;

        public GiangVien() {
        }

        public GiangVien(String hoTen, String maGV, String diaChi, String gioiTinh, String khoa) {
            this.hoTen = hoTen;
            this.maGV = maGV;
            this.diaChi = diaChi;
            this.gioiTinh = gioiTinh;
            this.khoa = khoa;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setMaGV(String maGV) {
            this.maGV = maGV;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public void setKhoa(String khoa) {
            this.khoa = khoa;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getMaGV() {
            return maGV;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public String getKhoa() {
            return khoa;
        }

        @Override
        public String toString() {
            return "GiangVien{" + "hoTen=" + hoTen + ", maGV=" + maGV + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + '}';
        }
        
    }
}
