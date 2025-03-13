/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.funcionario;

/**
 *
 * @author OzeiasJunior
 */
public class Operario implements Funcionario{
    
    private double salarioDia;
    public int diasTrabalhados;
    
    public Operario(){
        
    }

    public Operario(double salarioDia, int diasTrabalhados) {
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }
   
    @Override
    public Double calcularSalario() {
        return salarioDia * diasTrabalhados;
        
    }
    
}
