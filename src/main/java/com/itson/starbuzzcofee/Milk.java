/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta clase representa un condimento: Milk.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class Milk extends CondimentDecorator {

    private final double costoMilk = 9;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con Milk.
     *
     * @return La descripción de la bebida con Milk.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * Calcula el costo de la bebida con Milk.
     *
     * @return El costo de la bebida con Milk.
     */
    @Override
    public double cost() {
        double cost = beverage.cost() + costoMilk;
        return cost;
    }
}
