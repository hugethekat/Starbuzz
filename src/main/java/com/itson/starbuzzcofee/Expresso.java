/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un tipo de café: Expresso.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    /**
     * Calcula el costo del Expresso.
     *
     * @return El costo del Expresso.
     */
    @Override
    public double cost() {
        return 36;
    }
}




