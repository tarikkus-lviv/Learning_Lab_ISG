package Homework2_3;

import java.util.Scanner;

public class HourlyWorker implements salaryinterface{
    int weekhours;
    int rate;

    public void setInfo(Scanner info){
        System.out.println("What is your hour pay rate as an hourly worker?");
        setRate(info.nextInt());

        System.out.println("And how many hours did you work this month?");
        setWeekhours(info.nextInt());
    }

    public int getWeekhours() {
        return weekhours;
    }

    public void setWeekhours(int weekhours) {
        this.weekhours = weekhours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public void salary() {
        System.out.println("For working " + weekhours + " hours a week with rate " + rate + "$ per hour, you will get: " + (weekhours * rate) +"$");
    }

}
