package lampada;

public class lampada {

    private boolean estado;

    public lampada(){

        this.estado = false;
    }

    void acesa(){
        if(estado = true){
            System.out.println("acesa");
        }
    }

    void apagada(){
        if (estado = false) {
            System.out.println("apagada");
        }
    }

    void mostrarEstado(){
        System.out.println("A lampada esta:" + this.estado);
    }
    
}
