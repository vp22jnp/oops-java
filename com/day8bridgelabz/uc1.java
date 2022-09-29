package com.day8bridgelabz;

public class uc1 {
    void print() {
        System.out.println("welcome");
    }

    static class display extends uc1 {
        void print() {
            System.out.println("welcome to employee wage calculation program");
        }
    }

    public static void main(String[] args) {
        uc1 d = new display();
        d.print();
    }
}

