package Homework2_3;

interface salaryinterface{
    void hourlysalary();
    void mothlysalary();
}

public class Worker implements salaryinterface {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.hourlysalary();
        worker.mothlysalary();
    }

    @Override
    public void hourlysalary() {
        int rate = 12;
        int workingHours = 40;
        int wage = rate * workingHours;
        System.out.println("For working " + workingHours + " hours a month with rate " + rate + "$ per hour, you will get: " + wage +"$");
    }

    @Override
    public void mothlysalary() {
        int salary = 2500;
        System.out.println("Your standart salary per month is: " + salary + "$s");
    }
}
