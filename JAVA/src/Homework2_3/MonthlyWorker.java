package Homework2_3;

import java.util.Scanner;

public class MonthlyWorker implements salaryinterface{
    int salary;

    public void setInfo(Scanner info){
        System.out.println("What is your salary?");
        setSalery(info.nextInt());
    }

    public int getWage() {
        return salary;
    }

    public void setSalery(int salary) {
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println("You have a steady monthly salary of " + salary + "$");
    }
}
