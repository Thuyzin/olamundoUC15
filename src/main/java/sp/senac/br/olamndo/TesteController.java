package sp.senac.br.olamndo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TesteController {


    @FXML
    private Label welcomeText;
    @FXML
    private TextField textoMensagem;

    @FXML
    protected void onAbrirButtonClick() throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();; */

    }

    @FXML
    protected void onExibeButtonClick() {
        //Ler valor do textfield
        welcomeText.setText(textoMensagem.getText());
    }

}

