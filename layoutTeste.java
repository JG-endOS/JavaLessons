package java_texts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.stage.Stage;

// Importantes para o layout
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class layoutTeste extends Application {

    @Override
    public void start(Stage palco) {
        
        Button botao1 = new Button("Botão 1");
        Button botao2 = new Button("Botão 2");
        HBox hb = new HBox(botao1, botao2);
        hb.setAlignment(Pos.CENTER);

        Button botao3 = new Button("Botão 3");
        Button botao4 = new Button("Botão 4");
        VBox vb = new VBox(botao3, botao4);
        vb.setAlignment(Pos.CENTER);
        
        BorderPane bp = new BorderPane();
        bp.setTop(hb);
        bp.setCenter(vb);

        Scene cena = new Scene(bp, 300, 200);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
