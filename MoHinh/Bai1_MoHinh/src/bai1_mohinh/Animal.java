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
public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    
    abstract void Introduce();
    abstract void makeASound();
    abstract Animal giveBirth();
    abstract int checkStatus();
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
}
