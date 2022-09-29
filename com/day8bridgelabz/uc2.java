package com.day8bridgelabz;

public class uc2 {
    static void empcheck() {
        System.out.println("EMPCHECK");
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            System.out.println("employee is present");
        } else {
            System.out.println("employee is absent");
        }
    }
    public static void main(String[] args){
        empcheck();
    }

}

