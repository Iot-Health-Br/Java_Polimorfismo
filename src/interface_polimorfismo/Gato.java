/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo;

/*

  Ambas as classes, Dog e Cat, implementam a interface Animal. 
Isso significa que elas devem fornecer implementações para os 
métodos declarados na interface.

*/

public class Gato implements Animal {
    private final String name;

    public Gato(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public String getName() {
        return name;
    }
}
