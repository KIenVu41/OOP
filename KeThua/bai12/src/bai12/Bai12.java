/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CBGV> ds= new ArrayList<>();
        NhapDsCBGV(ds);
        WriteFile(ds, "CanBo.dat");
        ReadFile("CanBo.dat").forEach(x->{
            x.xuatCBGV();
        });
    }
    public static void NhapDsCBGV(ArrayList<CBGV> ds){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap DS CBGV: ");
        do{
            CBGV a= new CBGV();
            a.nhapCBGV();
            ds.add(a);
            System.out.println("Nhap tiep? c/k!");
        }while ("c".equalsIgnoreCase(sc.nextLine()));
    }
    
    public static void WriteFile(ArrayList<CBGV> ds, String path){
        try (FileOutputStream fos =new FileOutputStream(path);
                ObjectOutputStream oos =new ObjectOutputStream(fos)){
            oos.writeObject(ds);
            oos.close();
            fos.close();
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Write File Error!");
        }
    }
    
    public static ArrayList<CBGV> ReadFile(String path){
        Object ds = null;
        try (FileInputStream fis =new FileInputStream(path);
            ObjectInputStream ois =new ObjectInputStream(fis)){
            ds= ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Read File Error!");
        }
        return (ArrayList<CBGV>) ds;
    }
}
