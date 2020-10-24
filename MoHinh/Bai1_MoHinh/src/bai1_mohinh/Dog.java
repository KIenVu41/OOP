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
public class Dog extends Animal {
    static int population = 0;
    static String status;
    public Dog(String name) {
        super(name);
        population += 1;
        System.out.println("Dog has been created");
    }

    public int getPopulation() {
        return population;
    }
    public static void setStatus(String status) {
        Dog.status = status;
    }

    public static String getStatus() {
        return status;
    }
    @Override
    public void Introduce(){
        makeASound();
    }
    
    @Override
    public void makeASound(){
        System.out.println("gau gau " + name);
    }
    
    @Override
    public Dog giveBirth(){
        return new Dog(name +"'baby");
    }
    
    @Override
    public int checkStatus(){
        if(status == "dead"){
            population -= 1;
        }
        return population;
    }
}
