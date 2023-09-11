/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta es una clase abstracta que representa una bebida.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public abstract class Beverage {

    String description;

    /**
     * Calcula el costo de la bebida.
     *
     * @return El costo de la bebida.
     */
    public abstract double cost();

    /**
     * Obtiene la descripción de la bebida.
     *
     * @return La descripción de la bebida.
     */
    public String getDescription() {
        return description;
    }
}
