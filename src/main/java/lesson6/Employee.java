package lesson6;

public class Employee extends Person {

    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 2000;
    }
}
