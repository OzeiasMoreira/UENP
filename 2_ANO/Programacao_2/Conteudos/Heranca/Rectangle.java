package herança;

public class Rectangle extends TwoDShape{
    boolean isSquare(){
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}
