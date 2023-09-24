/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo;
import java.util.Comparator;
import interface_polimorfismo.Animal;
import interface_polimorfismo.Cachorro;
import interface_polimorfismo.Gato;

/*

    A classe AnimalComparator implementa a interface Comparator<Animal>, 
especificando o tipo genérico como Animal. Isso significa que a classe 
deve implementar o método compare() para comparar dois objetos do tipo Animal.

*/

public class Comparador_Animal implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName());
    }
}

