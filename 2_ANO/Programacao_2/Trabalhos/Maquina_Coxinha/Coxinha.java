import javafx.scene.control.Alert;

public class Coxinha {
    private Integer coxinhas;

    public Coxinha() {
        coxinhas = 0;
    }

    public Integer getCoxinhas() {
        return coxinhas;
    }

    public void setCoxinhas(Integer coxinhas) {
        this.coxinhas = coxinhas;
    }
    
    public void abastecer(Integer quantidade){
        if(quantidade > 0){
            setCoxinhas(getCoxinhas() + quantidade);
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Abasteça com uma quantidade maior que zero! ");
            alert.show();
            return; 
        } 
                
    }
    
    public void vender(){
        if(coxinhas <= 0){
           Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para vender");
            alert.show();
            return; 
        } else {
            coxinhas--;
        }
    }
    
    public void vender(Integer quantidade){
        if(quantidade > coxinhas){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para vender");
            alert.show();
            return; 
        } else {
            setCoxinhas(getCoxinhas() - quantidade);
        }
    }
    
    public void zerar(){
        if(coxinhas == 0){
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Estoque zerado.");
            alert.show();
            return; 
        } else {
            coxinhas = 0;
        }
    }
}

