/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.starbuzzcofee;

/**
 * Clase principal para calar.
 *
 * @author Hugo Eduardo Navarro Ramírez 233470
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        // Prueba con Dark Roast 
        Beverage darkRoast = new DarkRoast();
        System.out.println("Descripción de la bebida: " + darkRoast.getDescription());
        System.out.println("Costo de la bebida: $" + darkRoast.cost());

        // Agregar condimentos a Dark Roast
        darkRoast = new Soy(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new WhippedCream(darkRoast);
        System.out.println("Descripción de la bebida con condimentos: " + darkRoast.getDescription());
        System.out.println("Costo de la bebida con condimentos: $" + darkRoast.cost());

        // Prueba con Decaf
        Beverage decaf = new Decaf();
        System.out.println("\nDescripción de la bebida: " + decaf.getDescription());
        System.out.println("Costo de la bebida: $" + decaf.cost());

        // Agregar condimentos a Decaf
        decaf = new Soy(decaf);
        decaf = new Chocolate(decaf);
        System.out.println("Descripción de la bebida con condimentos: " + decaf.getDescription());
        System.out.println("Costo de la bebida con condimentos: $" + decaf.cost());

        // Prueba con Expresso
        Beverage espresso = new Expresso();
        System.out.println("\nDescripción de la bebida: " + espresso.getDescription());
        System.out.println("Costo de la bebida: $" + espresso.cost());

        // Agregar condimentos a Expresso
        espresso = new Milk(espresso);
        espresso = new WhippedCream(espresso);
        System.out.println("Descripción de la bebida con condimentos: " + espresso.getDescription());
        System.out.println("Costo de la bebida con condimentos: $" + espresso.cost());

        // Prueba con House Blend
        Beverage houseBlend = new HouseBlend();
        System.out.println("\nDescripción de la bebida: " + houseBlend.getDescription());
        System.out.println("Costo de la bebida: $" + houseBlend.cost());

        // Agregar condimentos a House Blend
        houseBlend = new Soy(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Chocolate(houseBlend);
        System.out.println("Descripción de la bebida con condimentos: " + houseBlend.getDescription());
        System.out.println("Costo de la bebida con condimentos: $" + houseBlend.cost());

    }

}
