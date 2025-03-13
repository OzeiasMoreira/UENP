/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap8.funcionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author OzeiasJunior
 */
public class FolhaPagamento {
    
    public static void main(String[] args) {
        
        ArrayList<Funcionario> list = new ArrayList<Funcionario>();
        Operario op = new Operario(85.00, 20);
        Operario op1 = new Operario(75.00, 18);
        list.add(op);
        list.add(op1);
        Gerente g = new Gerente(1450.00);
        Gerente g1 = new Gerente(1789.00);
        Gerente g2 = new Gerente(1230.00);
        list.add(g);
        list.add(g1);
        list.add(g2);
        
        for(Funcionario f : list){
            System.out.println(f.calcularSalario());
        }
        
        System.out.println("\n\n");
        Collections.sort(list, new ComparadorSalario());
        for(Funcionario f : list){
            System.out.println(f.calcularSalario());
        }
        
    }

}