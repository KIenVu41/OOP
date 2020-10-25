/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi implements Serializable {
    protected String HoTen;
    protected int NamSinh;
    protected String QueQuan;
    
    public Nguoi() {
    }

    public Nguoi(String HoTen, int NamSinh, String QueQuan) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.QueQuan = QueQuan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }
    public void nhapN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho Ten : ");
        setHoTen(sc.nextLine());
        System.out.print("Nam Sinh : ");
        setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.print("Que Quan : ");
        setQueQuan(sc.nextLine());
    }

    @Override
    public String toString() {
        return "HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", QueQuan=" + QueQuan;
    }
}
