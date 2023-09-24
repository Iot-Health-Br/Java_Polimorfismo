/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.empregado;


public abstract class ModeloEmpregado {
    private String nome;
    private String telefone;

public ModeloEmpregado(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;}

public abstract double calcularSalario();
    public String toString(){
    return String.format("%-20s%-20s%.2f", nome, telefone, calcularSalario());}
    
}