/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un condimento: WhippedCream.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class WhippedCream extends CondimentDecorator {

    private final double costoWhip = 5;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con WhippedCream.
     *
     * @return La descripción de la bebida con WhippedCream.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WhippedCream";
    }

    /**
     * Calcula el costo de la bebida con WhippedCream.
     *
     * @return El costo de la bebida con WhippedCream.
     */
    @Override
    public double cost() {
        double cost = beverage.cost() + costoWhip;
        return cost;
    }
}


