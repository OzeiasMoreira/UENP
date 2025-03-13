package provaSimulado.ex2;

public class Figura2D {
    private int largura;
    private int altura;

    public Figura2D(int largura,int altura){
        this.largura = 0;
        this.altura = 0;
        
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
}

public class Figura3D extends Figura2D{
    String estilo;
    public Figura3D(){
        super(0,0);
        estilo = "";
    }
}