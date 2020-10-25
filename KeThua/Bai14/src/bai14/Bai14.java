/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author Admin
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MaTran a = new MaTran();
        a.nhapMT();
        MaTran b = new MaTran();
        b.nhapMT();
        //a.tongMT(b);
        a.tichMT(b);
    }
    
}
