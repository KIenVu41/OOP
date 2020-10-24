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
public class Cat extends Animal {
    static int population = 0;
    static String status;

    public static void setStatus(String status) {
        Cat.status = status;
    }

    public static String getStatus() {
        return status;
    }
    
    public Cat(String name) {
        super(name);
        this.population += 1;
        System.out.println("Cat has been created");
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
        System.out.println("mow mow " + name);
    }
    
    @Override
    public Cat giveBirth(){
        return new Cat(name +"'baby");
    }
    
    @Override
    public int checkStatus(){
        if(status == "dead"){
            population -= 1;
        }
        return population;
    }
}
