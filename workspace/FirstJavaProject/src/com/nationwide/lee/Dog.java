package com.nationwide.lee;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating");
                }
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    
    public void makeNoise() {
        System.out.println("Dog is barking");
    }
    
    public void callSuperClass() {
        super.petsAreGreat();
    }
    
}