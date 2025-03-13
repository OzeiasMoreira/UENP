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
public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        LocalDate date = LocalDate.now();
        date = data.mudarData(date, 12, 1);
        System.out.println(date.toString());
        date = data.mudarData(date, 01, 2004, 11);
        System.out.println(date.toString());
        System.out.println(Util.formatarData(date));
    }
}
