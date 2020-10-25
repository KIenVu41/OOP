/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MaTran {
    protected int row;
    protected int col;
    protected int[][] arr = new int[9][9];
    Scanner sc = new Scanner(System.in);
    
    public MaTran() {
    }

    public MaTran(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    // nhap
    public void nhapMT(){
        System.out.println("");
        System.out.print("Nhap dong: ");
        setRow(sc.nextInt());
        System.out.print("Nhap cot: ");
        setCol(sc.nextInt());
        System.out.println("Nhap ma tran");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("arr[" + i + "}" + "[" + j + "]" + "= ");
                arr[i][j] =  sc.nextInt();
            }          
        }
    }
    
    // xuat
    public void xuatMT(){
        System.out.println("");
        System.out.println("Ma tran");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    // tong 2 ma tran
    public void tongMT(MaTran arr2){
        // hai ma tran phai cung kich thuoc
        if(row == arr2.row && col == arr2.col){
        MaTran c = new MaTran();
        c.setRow(row);
        c.setCol(col);
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    c.arr[i][j] = arr[i][j] + arr2.arr[i][j];
                }
            }
        // xuat ma tran tong
        c.xuatMT();
        }else System.out.println("Khong thoa man dieu kien!");
    }
    
    // hieu 2 ma tran
    public void hieuMT(MaTran arr2){
        // hai ma tran phai cung kich thuoc
        if(row == arr2.row && col == arr2.col){
        MaTran c = new MaTran();
        c.setRow(row);
        c.setCol(col);
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    c.arr[i][j] = arr[i][j] - arr2.arr[i][j];
                }
            }
        // xuat ma tran hieu
        c.xuatMT();
        }else System.out.println("Khong thoa man dieu kien!");
    }
    
    // tich 2 ma tran
    public void tichMT(MaTran arr2){
        // so cot ma tran trai bang so hang ma tran phai
        if(col == arr2.row){
            MaTran c = new MaTran();
            // ma tran tich co hang cua ma tran trai 
            // cot cua ma tran phai
            c.setRow(row);
            c.setCol(arr2.col);
            for(int i = 0; i < row; i++){
                for(int j = 0; j < arr2.col; j++){
                    c.arr[i][j] = 0;
                    for(int k = 0; k < row; k++){
                        c.arr[i][j] += arr[i][k]*arr2.arr[k][j];
                    }
                }
            }
            // xuat ma tran tich
            c.xuatMT();
        }else System.out.println("Khong thoa man dieu kien!");
    }
}
