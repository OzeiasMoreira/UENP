package herança;

/**
 * TwoDShape
 */
public class TwoDShape {

    private double width; // agora esses 
    private double height; // membros são privados

    //Construtor padrão
    TwoDShape(){
        width = height = 0.0;
    }

    //Construtor parametrizado
    TwoDShape(double w,double h){
        width = w;
        height = h;
    }

    //Constroi o objeto com altura e largura iguais
    TwoDShape(double x){
        width = height = x;
    }

    // Metodos acessadores para width e height
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

