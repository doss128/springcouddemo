package com.example.jbmei.confiig1.controller;

public class Demo2 implements Imp{
    public static void main(String[] args) {
        new Demo2().hello();
        Imp.hello2();
        Demo3 demo3=new Demo3("wang") {
            @Override
            public void hello() {

                System.out.println("hello");
            }
        };
        demo3.hello();
        System.out.println(demo3.getName());
    }
}
