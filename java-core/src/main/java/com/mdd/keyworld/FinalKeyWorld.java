package com.mdd.keyworld;

public class FinalKeyWorld {

    public static void main (String []args){
        Dog dog = new Dog();
        System.out.println(dog);
    }

}

class Animal{

    public int getAge() {
        return age;
    }

    public Animal() {
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    private String name;

    private final String kind = null;

    public final void say(int age,String name){
        System.out.println("name:"+name+"age:"+age);
    }

    public final void say(String name,int age){
        System.out.println("name:"+name+"age:"+age);
    }

    private void eat(){

    }

}

class Dog extends Animal{

    private String secondName;

    public String getSecondName() {
        return secondName;
    }

    public Dog() {
    }


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void say(String secondName){
        System.out.println("secondName:"+secondName);
    }
}

