/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form10;

/**
 *
 * @author Admin
 */
public class Form10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    static class GiangVien{
        protected String hoTen;
        protected String ma;
        protected String diaChi;
        protected String gioiTinh;
        protected String khoa;

        public GiangVien() {
        }

        public GiangVien(String hoTen, String ma, String diaChi, String gioiTinh, String khoa) {
            this.hoTen = hoTen;
            this.ma = ma;
            this.diaChi = diaChi;
            this.gioiTinh = gioiTinh;
            this.khoa = khoa;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setMa(String ma) {
            this.ma = ma;
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

        public String getMa() {
            return ma;
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
            return "GiangVien{" + "hoTen=" + hoTen + ", ma=" + ma + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + '}';
        }
        
    }
}
