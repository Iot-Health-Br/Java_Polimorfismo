package interface_polimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import interface_polimorfismo.Animal;

/*

  Ambas as classes, Dog e Cat, implementam a interface Animal. 
Isso significa que elas devem fornecer implementações para os 
métodos declarados na interface.

*/

public class Cachorro implements Animal {
    private final String name;

    public Cachorro(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String getName() {
        return name;
    }
}

