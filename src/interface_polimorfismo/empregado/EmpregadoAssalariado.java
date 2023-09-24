/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.empregado;
import interface_polimorfismo.empregado.ModeloEmpregado;


public class EmpregadoAssalariado extends ModeloEmpregado{
    private double salario;
    
public EmpregadoAssalariado(String nome, String telefone, double salario) {
    super(nome, telefone);
    this.salario = salario;}

public double calcularSalario() {
    return salario;}
//getters e setters omitidos
}