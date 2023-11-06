abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("The car is driving");
    }
}

class Bus extends Vehicle {
    void drive() {
        System.out.println("The bus is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();  // Outputs: The car is driving

        Bus bus = new Bus();
        bus.drive();  // Outputs: The bus is driving
    }
}
