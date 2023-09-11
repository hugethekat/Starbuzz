/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un tipo de café: Decaf.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    /**
     * Calcula el costo del Decaf.
     *
     * @return El costo del Decaf.
     */
    @Override
    public double cost() {
        return 30;
    }
}
