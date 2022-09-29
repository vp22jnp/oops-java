package com.day8bridgelabz;

import java.sql.SQLOutput;

public class employeewageusingclassmethod {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HRS=20;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static final int MAX_HRS_IN_MONTH=10;


public static int  empwage() {
    int emphrs = 0;
    int totalemphrs = 0;
    int numofworkingdays = 0;
    while (totalemphrs <= MAX_HRS_IN_MONTH && numofworkingdays < NUM_OF_WORKING_DAYS) {
        numofworkingdays++;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case IS_PART_TIME:
                emphrs = 4;
                break;
            case IS_FULL_TIME:
                emphrs = 8;
                break;
            default:
                emphrs = 0;
        }
        totalemphrs += emphrs;
        System.out.println(+numofworkingdays + emphrs);
    }
    int totalempwage = totalemphrs * EMP_RATE_PER_HRS;
    System.out.println("totalempwag" + totalempwage);
    return totalempwage;
}

    public static void main(String[] args) {
        empwage();
    }
}
