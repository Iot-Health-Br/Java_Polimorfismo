uso de interface em java
uso de polimorfismo
uso de classe que ordena uma lista de objetos e que implementa a interface Comparator

-----------------------------------------------------------------------------------------

Interface Animal: Define um contrato que as classes Dog e Cat devem seguir.

Classes Dog e Cat: Implementam a interface Animal, fornecendo comportamentos específicos para os métodos makeSound() e getName().

Classe AnimalComparator: Define um método de comparação entre dois objetos Animal para ordenação.

Polimorfismo: Dog e Cat são tratados como objetos do tipo Animal, permitindo a utilização de métodos da interface Animal de forma intercambiável.

Ordenação de Lista: A lista de animais é ordenada com base nos nomes usando a classe AnimalComparator e o método sort da classe Collections.

-----------------------------------------------------------------------------------------