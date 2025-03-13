/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponto;

/**
 *
 * @author Ozeias
 */
public class Robo {
    
    Ponto posicao;
    String nome;
    
    public Robo(){
        this.nome = "";
        posicao = new Ponto();
    }

    public Ponto getPosicao() {
        return posicao;
    }

    public void setPosicao(Ponto posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void andarDireita(){
        posicao.setX(posicao.getX()+1);
    }
    
    public void andarEsquerda(){
        posicao.setX(posicao.getX()-1);
    }
    
    public void andarCima(){
        posicao.setY(posicao.getY()+1);
    }
    
    public void andarBaixo(){
        posicao.setY(posicao.getY()-1);
    }
    
    public void mostrarPosicao(){
        System.out.println(String.format("Robo '%s' esta no ponto: (%d %d).",
                this.nome,this.posicao.getX(),this.posicao.getY()));
    }
    
    public boolean colidir(Robo novoRobo){
        return novoRobo.getPosicao().getX() == this.posicao.getX() &&
                novoRobo.getPosicao().getY() == this.posicao.getY();
    }
}
