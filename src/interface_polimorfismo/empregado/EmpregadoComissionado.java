/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.empregado;

public class EmpregadoComissionado extends ModeloEmpregado{
    private double vendasBrutas;
    private double comissao;
    
public EmpregadoComissionado(String nome, String telefone, double
    vendasBrutas, double comissao) {
    super(nome, telefone);
    this.vendasBrutas = vendasBrutas;
    this.comissao = comissao;}

public double calcularSalario() {
    return vendasBrutas * comissao;}

}
