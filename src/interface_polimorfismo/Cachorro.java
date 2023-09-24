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

/*
  Aqui, a classe Cachorro está declarando que irá implementar (cumprir o contrato de) 
a interface Animal. Portanto, ela deve fornecer implementações para todos os métodos
declarados na interface Animal.
*/
public class Cachorro implements Animal {
    /*
      Name é uma variável de instância privada da classe Cachorro. É final, o que significa 
    que, uma vez atribuído, não pode ser alterado. Apenas métodos dentro da classe Cachorro 
    podem acessá-la diretamente.
    */
    private final String name;

    /*
      Este é o construtor da classe Cachorro, que é usado para criar instâncias (objetos) 
    desta classe. O construtor aceita um parâmetro name, que inicializa a variável de instância 
    name do objeto sendo criado.
    */
    public Cachorro(String name) {
        this.name = name;
    }

    /*
      A anotação @Override é usada para indicar que o método subsequente está sobrescrevendo um método 
    da superclasse ou implementando um método de uma interface. Isso não é estritamente necessário, 
    mas é uma boa prática, pois permite que o compilador verifique se você está, de fato, sobrescrevendo 
    ou implementando um método existente.
    */
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String getName() {
        return name;
    }
}

