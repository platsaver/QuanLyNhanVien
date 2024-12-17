package quanlynhanvien;

public class PTEmployee extends Employee {
    public PTEmployee(String name, int paymentPerHour, int workingHour){
        super (name, paymentPerHour, workingHour);
    }
    public void calculateSalary(){
        int salary = getPaid()*getWorkingHour(); 
        System.out.println(salary);
    }
}
