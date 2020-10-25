/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CBGV extends Nguoi{
    protected double LuongC;
    protected double Thuong;
    protected double Phat;
    protected double LuongTL;

    public CBGV() {
    }

    public CBGV(double LuongC, double Thuong, double Phat, double LuongTL) {
        this.LuongC = LuongC;
        this.Thuong = Thuong;
        this.Phat = Phat;
        this.LuongTL = LuongTL;
    }

    public double getLuongC() {
        return LuongC;
    }

    public void setLuongC(double LuongC) {
        this.LuongC = LuongC;
    }

    public double getThuong() {
        return Thuong;
    }

    public void setThuong(double Thuong) {
        this.Thuong = Thuong;
    }

    public double getPhat() {
        return Phat;
    }

    public void setPhat(double Phat) {
        this.Phat = Phat;
    }

    public double getLuongTL() {
        return LuongTL;
    }

    public void setLuongTL(double LuongTL) {
        this.LuongTL = LuongTL;
    }
    
    public void nhapCBGV(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhap Thong Tin Ca Nhan: ");
        super.nhapN();
        System.out.print("Nhap Luong Cung: ");
        setLuongC(sc.nextDouble());
        System.out.print("Nhap Thuong: ");
        setThuong(sc.nextDouble());
        System.out.print("Nhap Phat: ");
        setPhat(sc.nextDouble());
        setLuongTL(LuongC+Thuong-Phat);
    }
    
    public void xuatCBGV(){
        System.out.println(super.toString()+"\tLuong Cung: "+LuongC+"\tThuong: "+Thuong+"\tPhat: "+Phat+"\tLuong Thuc Linh: "+LuongTL);
    }
}
