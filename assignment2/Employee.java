package assignment2;

import java.util.Scanner;

class Employee1 {
    private double salary;
    private int hoursOfWorkPerDay;

    public void getInfo(double salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() {
        return salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the salary of the Employee1:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of hours of work per day:");
        int hoursOfWorkPerDay = scanner.nextInt();

        Employee1 Employee1 = new Employee1();
        Employee1.getInfo(salary, hoursOfWorkPerDay);
        Employee1.addSal();
        Employee1.addWork();

        double finalSalary = Employee1.getFinalSalary();
        System.out.println("Final Salary: $" + finalSalary);

        scanner.close();
    }
}
