/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;

/**
 *
 * @author Ozeias
 */
public class Data {
    public Data(){
        
    }
    
    public LocalDate mudarData(LocalDate data,Integer ano){
        return data.withYear(ano);
    }
    
    public LocalDate mudarData(LocalDate data, Integer mes,Integer ano){
        return data.withMonth(mes).withYear(ano);
    }
    
    public LocalDate mudarData(LocalDate data, Integer mes, Integer ano, Integer dia){
        return data.withDayOfMonth(dia).withMonth(mes).withYear(ano);
    }
}
