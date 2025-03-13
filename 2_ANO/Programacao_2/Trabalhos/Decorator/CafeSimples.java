
public interface Cafe {
    String getDescricao();
    double getCusto();
}

public class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 2.0;
    }
}

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}

public class ComLeite extends CafeDecorator {
    public ComLeite(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com leite";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.5;
    }
}

public class ComChocolate extends CafeDecorator {
    public ComChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com chocolate";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.7;
    }
}

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        System.out.println(cafe.getDescricao() + " Custo: " + cafe.getCusto());

        cafe = new ComLeite(cafe);
        System.out.println(cafe.getDescricao() + " Custo: " + cafe.getCusto());

        cafe = new ComChocolate(cafe);
        System.out.println(cafe.getDescricao() + " Custo: " + cafe.getCusto());
    }
}
 {
    
}
