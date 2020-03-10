/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.j110.example.employees;

/**
 *
 * @author Admin
 */
public class Employee {
    private String name;
    private String surname;
    
    private Position position;

    public Employee(String name, String surname, Position position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", position=" + position + '}';
    }
    
    
    
}
