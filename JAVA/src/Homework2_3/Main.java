package Homework2_3;

import java.util.Scanner;

interface salaryinterface{
    void salary();
}

public class Main {
    public static void main(String[] args) {
        HourlyWorker hw = new HourlyWorker();
        hw.setInfo(new Scanner(System.in));
        hw.salary();

        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");

        MonthlyWorker ms = new MonthlyWorker();
        ms.setInfo(new Scanner(System.in));
        ms.salary();


    }
}
