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
public class Bus extends Car implements Transport {
    
    private String line;
    
    public Bus(String color, String number, Employee driver, String line) {
        super(color, number, driver);
        this.line = line;
    }

    public Bus(String line, String color, String number) {
        super(color, number);
        this.line = line;
    }
    
    

    @Override
    public String toString() {
        return "Bus{" + "line=" + line + '}';
    }

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
