/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un tipo de café: House Blend.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    /**
     * Calcula el costo del House Blend.
     *
     * @return El costo del House Blend.
     */
    @Override
    public double cost() {
        return 38;
    }
}


