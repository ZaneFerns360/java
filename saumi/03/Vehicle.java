abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a Car");
    }
}

class Bus extends Vehicle {
    void drive() {
        System.out.println("Driving a Bus");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        car.drive();
        bus.drive();
    }
}
