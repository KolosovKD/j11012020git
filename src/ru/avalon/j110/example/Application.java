package ru.avalon.j110.example;

import ru.avalon.j110.example.employees.Employee;
import ru.avalon.j110.example.employees.Position;
import ru.avalon.j110.example.models.*;

/**
 *
 * @author Admin
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garage garage = new Garage("А13Б2");
        Garage emptyGarage = new Garage("А13Б2");
        
        Position driverPosition = new Position("driver");
        Employee driver = new Employee("Ivan", "Ivanov", driverPosition);
        Car car = new Car("red", "ao345p", driver);
        Car carWithoutDriver = new Car("blue", "oa543p");
        
        carWithoutDriver.setDriver(driver);
        
        garage.setCarInside(car);
        
        System.out.println(garage);
        System.out.println("garage == emptyGarage : " + (garage == emptyGarage));
        System.out.println("garage equals emptyGarage : " + garage.equals(emptyGarage));
        
        int[] intArray = new int[10];
        int secondArray[] = {13, 12, 15, 7};
        
        int lastIndex = intArray.length - 1;
        intArray[lastIndex] = 123;
        System.out.println(intArray[lastIndex]);
        
        Car[] cars = new Car[2];
        
        cars[0] = car;
        cars[1] = carWithoutDriver;
        
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        
        long longValue = 999;
        int intValue = (int) longValue;
        
        Bus bus = new Bus("blue", "oo332e", driver, "Е-255");
        
        Car busCar = bus;
        
        System.out.println(bus);
        
    }
    
}
