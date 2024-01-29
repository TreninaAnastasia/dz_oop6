// Отдельный класс для расчета зарплаты
public class SalaryCalculator {
    public static int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int calculateNetSalary() {
        return SalaryCalculator.calculateNetSalary(baseSalary);
    }
}

public abstract class Vehicle {
    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public abstract double calculateAllowedSpeed();
}

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}

public interface Shape {
    double area();
}

public interface SolidShape {
    double volume();
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements Shape, SolidShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}

public interface Quadrilateral {
    void setWidth(int width);

    void setHeight(int height);

    int area();
}

public class Rectangle implements Quadrilateral {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}

public class Square implements Quadrilateral {
    private int side;

    public void setWidth(int width) {
        this.side = width;
    }

    public void setHeight(int height) {
        this.side = height;
    }

    public int area() {
        return this.side * this.side;
    }
}

public interface Engine {
    void start();
}

public class PetrolEngine implements Engine {
    public void start() {
        // Реализация запуска бензинового двигателя
    }
}

public class DieselEngine implements Engine {
    public void start() {
        // Реализация запуска дизельного двигателя
    }
}

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
