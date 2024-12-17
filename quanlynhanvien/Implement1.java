package quanlynhanvien;

public class Implement1 implements Interface {
    private Employee em;
    public Implement1(String name, int paymentPerHour, int workingHour) {
        em = new Employee(name, paymentPerHour, workingHour);  // Initialize Employee object with given data
    }

    @Override
    public void calculateSalary(int salary) {
        System.out.println("Salary calculated from Interface: " + salary);
    }

    @Override
    public void getName(String name) {
        em.setName(name);
        System.out.println("Employee Name: " + em.getName());
    }
}
