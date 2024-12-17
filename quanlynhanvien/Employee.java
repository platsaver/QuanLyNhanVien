package quanlynhanvien;

import java.util.Scanner;

public class Employee{
    private String name; 
    private int paymentPerHour; 
    private int workingHour; 
    public void input(Scanner object){
        name = object.nextLine();
        paymentPerHour = object.nextInt();
    }
    public Employee(String name, int paymentPerHour){
        this.name = name; 
        this.paymentPerHour = paymentPerHour; 
    }
    public Employee(String name, int paymentPerHour, int workingHour){
        this.name = name; 
        this.paymentPerHour = paymentPerHour;
        this.workingHour = workingHour; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public String getName(){
        return name; 
    }
    public void setPaid(int paymentPerHour){
        this.paymentPerHour = paymentPerHour; 
    }
    public int getPaid(){
        return paymentPerHour; 
    }
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour; 
    }
    public int getWorkingHour(){
        return workingHour;
    }
}
