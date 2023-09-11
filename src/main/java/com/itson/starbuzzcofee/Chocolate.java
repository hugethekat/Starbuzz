/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un condimento: Chocolate.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class Chocolate extends CondimentDecorator {

    private final double costoChocolate = 8;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con Chocolate.
     *
     * @return La descripción de la bebida con Chocolate.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    /**
     * Calcula el costo de la bebida con Chocolate.
     *
     * @return El costo de la bebida con Chocolate.
     */
    @Override
    public double cost() {
        double cost = beverage.cost() + costoChocolate;
        return cost;
    }
}


