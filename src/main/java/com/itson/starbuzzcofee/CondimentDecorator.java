/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.starbuzzcofee;

/**
 * Esta es una clase abstracta que representa un decorador de condimentos para
 * una bebida.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    /**
     * Obtiene la descripción de la bebida decorada.
     *
     * @return La descripción de la bebida decorada.
     */
    @Override
    public abstract String getDescription();
}
