class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Director extends Employee {

    Director(String name) {
        super(name);
    }
}

class Supervisor extends Employee {

    Supervisor(String name) {
        super(name);
    }
}

public class e {
    static void sayHello(Employee employee) {
        if (employee instanceof Director) {
            Director director = (Director) employee;
            System.out.println("Hello Director " + director.name);
        } else if (employee instanceof Supervisor) {
            Supervisor supervisor = (Supervisor) employee;
            System.out.println("Hello Supervisor " + supervisor.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Director("Dj");
        Employee emp2 = new Supervisor("Jh");
        Employee emp3 = new Employee("Cl");

        sayHello(emp1); // Output: Hello Director Dj
        sayHello(emp2); // Output: Hello Supervisor Jh
        sayHello(emp3); // Output: Hello Employee Cl
    }
}
