package java_texts;

// Imports padrão para fazer a aplicação em javafx
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

// Imports importantes para essa aplicação 
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class gridPaneTeste extends Application {
    
    @Override
    public void start(Stage palco) {
        
        // Elementos
        Label rotuloNome = new Label("Nome: ");
        Label rotuloEmail = new Label("E-mail: ");

        TextField areaNome = new TextField();
        TextField areaEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        // Definição do GridPane 
        GridPane gp = new GridPane();
        gp.setHgap(8); // Definindo o espçamento horizontal
        gp.setVgap(8); // Definindo o espaçamento vertical
        gp.setPadding(new Insets(5)); // Espaçamento externo
        
        // Adicionado elemntos ao GridPane
        gp.addRow(0, rotuloNome, areaNome);
        gp.addRow(1, rotuloEmail, areaEmail);
        gp.addRow(2, botaoEnviar);
        
        Scene cena = new Scene(gp, 400, 200);

        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args) {

        launch(args);

    }
}
