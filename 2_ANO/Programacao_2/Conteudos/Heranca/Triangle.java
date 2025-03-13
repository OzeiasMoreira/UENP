package herança;

// Subclasse de TwoDShape para triangulos
public class Triangle extends TwoDShape{
    private String style;

    //Construtor padrão
    Triangle(){
        super();
        style = "";
    }

    // Construtor
    Triangle(String s,double w, double h){
        super(w, h);
        style = s;
    }

    //Construtor com um argumento
    Triangle(double x){
        super(x); // chama o constutor da superclasse
        style = "filled";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
