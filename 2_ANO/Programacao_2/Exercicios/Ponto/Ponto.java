/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponto;

/**
 *
 * @author Ozeias
 */
public class Ponto {
    private Integer px;
    private Integer py;
    
    public Ponto(){
        this.px = 0;
        this.py = 0;
    }

    public Ponto(Integer px, Integer py) {
        this.px = px;
        this.py = py;
    }

    public Integer getX() {
        return px;
    }

    public void setX(Integer px) {
        this.px = px;
    }

    public Integer getY() {
        return py;
    }

    public void setY(Integer py) {
        this.py = py;
    }
    
    
}
