/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Ozeias
 */
public class Objetos {
    private static Integer qtdObjetos = 0;
    
    public Objetos(){
        super();
        qtdObjetos++;
    }
    
    public static Integer getQtdObjetos(){
        return qtdObjetos;
    }
}
