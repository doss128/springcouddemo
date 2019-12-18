package com.example.jbmei.confiig1.controller;

public abstract class Demo3 {

    private  String name;
    public abstract void hello();

    public String test(){
        System.out.println("test");
        return null;
    }

    public Demo3(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
