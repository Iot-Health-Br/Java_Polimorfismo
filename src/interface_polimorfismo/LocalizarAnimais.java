/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_polimorfismo.Animal;
import interface_polimorfismo.Cachorro;
import interface_polimorfismo.Gato;
import interface_polimorfismo.Comparador_Animal;
/**
 *
 * @author igl_m
 */
public class LocalizarAnimais {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro("Rex"));
        animals.add(new Gato("Whiskers"));
        animals.add(new Cachorro("Buddy"));

        System.out.println("Antes de ordenar:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.makeSound(); // Uso de polimorfismo
        }

        Collections.sort(animals, new Comparador_Animal());

        System.out.println("\nDepois de ordenar:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.makeSound(); // Uso de polimorfismo
        }
    }
}
