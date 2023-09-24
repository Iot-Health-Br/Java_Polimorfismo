/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_polimorfismo.animal.Animal;
import interface_polimorfismo.animal.Cachorro;
import interface_polimorfismo.animal.Gato;
import interface_polimorfismo.animal.Comparador_Animal;

public class LocalizarAnimais {

    public static void main(String[] args) {
        
        /* Uma lista de animais é criada. Esta lista pode conter objetos 
        de qualquer classe que implemente a interface Animal
        */
        List<Animal> animals = new ArrayList<>();
        
        /*
           Animais são adicionados à lista: Objetos da classe Cachorro e objeto 
        da classe gato, onde irão implementar a interface Animal.
        */
        animals.add(new Cachorro("Rex"));
        animals.add(new Gato("Whiskers"));
        animals.add(new Cachorro("Buddy"));
        animals.add(new Cachorro("Atlas"));
        animals.add(new Gato("Petisco"));
        animals.add(new Cachorro("Hercules"));

        System.out.println("Antes de ordenar:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.makeSound(); // Uso de polimorfismo
        }

        /*
           A lista de animais é ordenada usando o método sort da classe utilitária Collections, 
        juntamente com uma instância da classe Comparador_Animal. Isso ordenará a lista com 
        base nos nomes dos animais, conforme definido no método compare da classe Comparador_Animal.
        */
        Collections.sort(animals, new Comparador_Animal());

        System.out.println("\nDepois de ordenar:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.makeSound(); // Uso de polimorfismo
        }
    }
}
