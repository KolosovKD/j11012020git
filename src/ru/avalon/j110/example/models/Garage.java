/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.j110.example.models;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Garage {
    
    private String number;
    private Car carInside;
    
    public Garage(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Car getCarInside() {
        return carInside;
    }

    public void setCarInside(Car carInside) {
        this.carInside = carInside;
    }

    @Override
    public String toString() {
        return "Garage{" + "number=" + number + ", carInside=" + carInside + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.number);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Garage other = (Garage) obj;
        if(!this.number.equals(other.number)) {
            return false;
        }
        return true;
    }
    
    
    
}
