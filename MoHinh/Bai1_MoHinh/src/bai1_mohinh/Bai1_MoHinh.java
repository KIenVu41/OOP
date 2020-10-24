/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_mohinh;

/**
 *
 * @author kienvu
 */
public class Bai1_MoHinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat = new Cat("Tom");
        /*Cow cow = new Cow("Jim");
        Dog dog = new Dog("Bucky");
        cat.Introduce();*/
        Cat cat2 = new Cat("TT");
        System.out.println(cat2.giveBirth().toString());
        Cat cat3 = new Cat("rr");
        System.out.println(cat3.getPopulation());
        cat2.setStatus("dead");
        System.out.println(cat2.checkStatus());
        /*cat3.setStatus("dead");
        System.out.println(cat3.checkStatus());
        cat.setStatus("dead");
        System.out.println(cat.checkStatus());*/
        
    }   
}
