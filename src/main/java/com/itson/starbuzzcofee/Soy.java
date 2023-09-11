/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un condimento: Soy.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class Soy extends CondimentDecorator {

    private final double costoSoy = 7;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con Soy.
     *
     * @return La descripción de la bebida con Soy.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * Calcula el costo de la bebida con Soy.
     *
     * @return El costo de la bebida con Soy.
     */
    @Override
    public double cost() {
        double cost = beverage.cost() + costoSoy;
        return cost;
    }
}


