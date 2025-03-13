/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.funcionario;

import java.util.Comparator;

/**
 *
 * @author OzeiasJunior
 */
public class ComparadorSalario implements Comparator<Funcionario>{
    
    @Override
    public int compare(Funcionario o1, Funcionario o2){
        if(o1.calcularSalario() < o2.calcularSalario()){
            return -1;
        }
        
        if(o1.calcularSalario() == o2.calcularSalario()){
            return 0;
        }
        
        return 1;
    }
}
