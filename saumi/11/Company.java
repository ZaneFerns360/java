class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    void printSalary() {
        System.out.println("Salary: Rs. " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 30, "1234567890", "123 Main St", 500000.0, "Software Engineer");
        Manager manager = new Manager("XYZ", 35, "9876543210", "456 Side St", 1800000.0, "Human Resources");

        System.out.println("Employee Details:");
        employee.printDetails();
        employee.printSalary();

        System.out.println("\nManager Details:");
        manager.printDetails();
        manager.printSalary();
    }
}
