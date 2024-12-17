package quanlynhanvien;

public class FTEmployee extends Employee{
    public FTEmployee (String name, int paymentPerHour){
        super (name, paymentPerHour); 
    }
    public void calculateSalary(){
        int salary = getPaid()*8;
        System.out.println(salary); 
    }
}
