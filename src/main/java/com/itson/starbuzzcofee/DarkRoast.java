/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un tipo de café: Dark Roast.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    /**
     * Calcula el costo del Dark Roast.
     *
     * @return El costo del Dark Roast.
     */
    @Override
    public double cost() {
        return 45;
    }
}
