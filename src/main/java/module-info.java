module sp.senac.br.olamndo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens sp.senac.br.olamndo to javafx.fxml;
    exports sp.senac.br.olamndo;
}