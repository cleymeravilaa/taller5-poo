public class  Employee {
    public String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Verificar que el salario sea positivo
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        } else {
            this.salary = salary;
        }
    }
}