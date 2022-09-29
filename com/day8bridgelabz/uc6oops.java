package com.day8bridgelabz;

public class uc6oops {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME=1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static final int MAX_HRS_IN_MONTH = 10;


    public static int empcheck() {
        int emphrs=0,totalemphrs=0, totalworkingdays=0;
        while(totalemphrs<=MAX_HRS_IN_MONTH &&totalworkingdays<NUM_OF_WORKING_DAYS){
            totalworkingdays++;
            int empcheck= (int) Math.floor((Math.random() * 10) % 3);
            switch (empcheck) {
                case IS_PART_TIME :
                    emphrs=4;
                    break;
                case IS_FULL_TIME:
                    emphrs=8;
                    break;
                default :
                    emphrs=0;

            }
            totalemphrs+= emphrs;
            System.out.println("Day#:"+totalworkingdays+"emphrs:"+emphrs);
            System.out.println("empwage:");
        }
        int total=totalemphrs= totalemphrs*EMP_RATE_PER_HOUR;
        System.out.println("Total :" +total );
        return total;
    }

    public static void main(String[] args) {
        empcheck();
    }
}

