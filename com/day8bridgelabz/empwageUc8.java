package com.day8bridgelabz;
import java.sql.SQLOutput;
public class empwageUc8 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static int empwage (String company ,int emprateperhour,int numofworkingdays,int maxhourspermonth  ){
        int emphrs = 0,totalemphrs = 0, totalworkingdays = 0;
        while (totalemphrs <= maxhourspermonth && totalworkingdays < numofworkingdays) {
            totalworkingdays++;
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
            System.out.println(+totalworkingdays + emphrs);
        }
        int totalempwage = totalemphrs * emprateperhour;
        System.out.println("totalempwag" + totalempwage);
        return totalempwage;
    }

    public static void main(String[] args) {
        empwage("DMART", 20,2,10);
        empwage ("reliance", 10,4,20);
    }
}


