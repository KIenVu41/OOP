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
public class Cow extends Animal {
    static int population = 0;
    static String status;
    public Cow(String name) {
        super(name);
        population += 1;
        System.out.println("Cow has been created");
    }

    public static void setStatus(String status) {
        Cow.status = status;
    }

    public static String getStatus() {
        return status;
    }

    public int getPopulation() {
        return population;
    }
    
    @Override
    public void Introduce(){
        makeASound();
    }
    
    @Override
    public void makeASound(){
        System.out.println("moo moo " + name);
    }
    
     @Override
    public Cow giveBirth(){
        return new Cow(name +"'baby");
    }
    
    @Override
    public int checkStatus(){
        if(status == "dead"){
            population -= 1;
        }
        return population;
    }
}