import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controlador {
    @FXML
    private TextField estoque;
    
    @FXML
    private TextField campoAbastecer;
    
    @FXML
    private TextField campoVender;
    
    private Coxinha coxinha;
    
     @FXML
    private void initialize(){
        coxinha = new Coxinha();
        estoque.setText(String.valueOf(coxinha.getCoxinhas()));
    }
    
    @FXML
    private void atualizar(){
        estoque.setText(String.valueOf(coxinha.getCoxinhas()));
    }
    
    @FXML
    private void abastecer(){
        coxinha.abastecer(Integer.parseInt(campoAbastecer.getText()));
        campoAbastecer.setText("");
        atualizar();

    }
    
     @FXML
    private void vender1(){
        coxinha.vender();
        atualizar();
    }
    
    @FXML
    private void vender(){
        coxinha.vender(Integer.parseInt(campoVender.getText()));
        campoVender.setText("");
        atualizar();
    }
    
    @FXML
    private void zerar(){
        coxinha.zerar();
        atualizar();
        
    }
}

