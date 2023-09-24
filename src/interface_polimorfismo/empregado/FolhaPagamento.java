/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.empregado;


public class FolhaPagamento {
    public static void main(String[] args) {
        ModeloEmpregado [] empregados = new ModeloEmpregado[3];
        empregados[0] = new EmpregadoAssalariado("José", "3231-2323", 1500);
        empregados[1] = new EmpregadoComissionado("Marcos", "3132-3366", 30000, 0.07);
        empregados[2] = new EmpregadoHorista("Antônio", "3322-1122", 40, 55);
    
        for(ModeloEmpregado emp : empregados){
            System.out.println(emp);}
    }
}