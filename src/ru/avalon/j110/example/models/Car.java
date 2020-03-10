/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.j110.example.models;

import ru.avalon.j110.example.employees.Employee;


/**
 *
 * @author Admin
 */
public class Car {
    protected String color;
    protected String number;
    protected Employee driver;
    
    public Car(String color, String number, Employee driver) {
        this(color, number);
        this.driver = driver;
    }
    
    public Car(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Employee getDriver() {
        return driver;
    }

    public void setDriver(Employee driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", number=" + number + ", driver=" + driver + '}';
    }
    
    private void changeOil() {
        
    }
    
}
