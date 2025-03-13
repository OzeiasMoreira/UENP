/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.funcionario;

/**
 *
 * @author OzeiasJunior
 */
public class Gerente implements Funcionario{
    
    private Double salarioMes;
   
    
    public Gerente(){
        
    }

    public Gerente(Double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public Double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(Double salarioMes) {
        this.salarioMes = salarioMes;
    }
    
    @Override
    public Double calcularSalario() {
         return salarioMes * 1.1;   
    }
    
}
