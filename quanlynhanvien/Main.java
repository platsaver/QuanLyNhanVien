package quanlynhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Welcome to the Employee Management System!");

        System.out.print("Enter employee name: ");
        String name = object.nextLine();

        System.out.print("Enter payment per hour: ");
        int paymentPerHour = object.nextInt();

        System.out.print("Enter working hours (enter 0 for full-time): ");
        int workingHour = object.nextInt();

        if (workingHour > 0) {
            PTEmployee partTimeEmployee = new PTEmployee(name, paymentPerHour, workingHour);
            System.out.print("Part-Time Employee Salary: ");
            partTimeEmployee.calculateSalary();
        } else {
            FTEmployee fullTimeEmployee = new FTEmployee(name, paymentPerHour);
            System.out.print("Full-Time Employee Salary: ");
            fullTimeEmployee.calculateSalary();
        }

        object.close();
    }
}
