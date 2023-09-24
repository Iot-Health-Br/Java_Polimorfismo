/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interface_polimorfismo;

/*
  A interface Animal declara dois métodos que as classes que a
implementam devem definir: makeSound() e getName().

Qualquer classe que declare que implementa a interface Animal deve fornecer implementações 
para ambos os métodos makeSound() e getName(). Por exemplo, uma classe Dog que implementa Animal 
precisa definir como makeSound() e getName() devem funcionar para um objeto Dog
*/


public interface Animal {
    /* Este método não tem retorno (void) e não recebe nenhum parâmetro.As classes que implementam 
    esta interface devem fornecer uma implementação para este método. 
    Este método, provavelmente, deve ser utilizado para fazer o animal emitir um som, como latir 
    para um cachorro ou miar para um gato.
    */
    void makeSound();   
    /*
    Este método retorna uma String e também não recebe nenhum parâmetro. As classes que implementam 
    esta interface devem fornecer uma implementação para este método. Este método, provavelmente, 
    deve ser utilizado para obter o nome do animal.
    */
    String getName();
}
