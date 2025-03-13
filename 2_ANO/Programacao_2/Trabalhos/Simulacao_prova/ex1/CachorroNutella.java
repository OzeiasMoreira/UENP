public class Cachorro {
    public void latir(){
        System.out.println("au au");
    }
}

public class CachorroNutella extends Cachorro{
    protected void latir(){
        System.out.println("ai ai ai");
    }
}
