/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.animal;

/*

  Ambas as classes, Dog e Cat, implementam a interface Animal. 
Isso significa que elas devem fornecer implementações para os 
métodos declarados na interface.

*/

public class Gato implements Animal {
    
    // String Private que pode ser utilizada dentro desta classe
    private final String name;

    // Construtor Gato
    public Gato(String name) {
        this.name = name;
    }

    // Quando chamado faz o som da Classe Gato
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // Quando chamado retorna o nome armazenado na classe Gato
    @Override
    public String getName() {
        return name;
    }
}
