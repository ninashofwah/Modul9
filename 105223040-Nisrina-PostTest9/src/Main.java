class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return baseSalary + 500.0;
        }
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1000.0;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return baseSalary + 1000.0 + 500.0;
        }
        return baseSalary + 1000.0;
    }
}

class DataScientist extends Employee {
    public DataScientist(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1200;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return baseSalary + 1200 + 700;
        }
        return baseSalary + 1200;
    }
}

class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return baseSalary + 200;
        }
        return baseSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SoftwareEngineer("Rippun", 6000);
        employees[1] = new DataScientist("Tisam", 7000);
        employees[2] = new Intern("Nayla", 3000);

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Salary with bonus: " + emp.calculateSalary(true));
            System.out.println("-------------------------");
        }
    }
}