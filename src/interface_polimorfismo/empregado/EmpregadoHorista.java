/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.empregado;


public class EmpregadoHorista extends ModeloEmpregado {
    private int qtdHorasTrab;
    private double valorHora;
    
public EmpregadoHorista(String nome, String telefone, int qtdHorasTrab,
    double valorHora) {
    super(nome, telefone);
    this.qtdHorasTrab = qtdHorasTrab;
    this.valorHora = valorHora;}

public double calcularSalario() {
    return qtdHorasTrab * valorHora;}
//getters e setters omitidos
}