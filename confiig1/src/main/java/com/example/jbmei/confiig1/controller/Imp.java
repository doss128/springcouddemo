package com.example.jbmei.confiig1.controller;

public interface Imp {

    String x="1";

    public default void hello(){
        System.out.println("hello");
    }

    public static void hello2(){
        System.out.println("hello2");
    }
}
