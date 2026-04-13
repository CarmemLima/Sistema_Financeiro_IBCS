/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.main;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ibcs.dao.MembroTesteDAO;



/**
 *
 * @author Carmem
 */
//Classe para estilização - JavaFX
    public class App extends Application {
        
        @Override
        public void start (Stage stage){
            
            TextField txtNome = new TextField();
            txtNome.setPromptText("Nome");
            
            TextField txtEmail = new TextField();
            txtEmail.setPromptText("Email");
            
            Button btnCadastrar = new Button("Cadastrar");
            
            Label mensagem = new Label();
            
            btnCadastrar.setOnAction(e -> {
                
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                
                new MembroTesteDAO().cadastrar(15, "Juliano", "juliano.com");
                
                mensagem.setText("Cadastrado com sucesso");
            });
            
            VBox layout = new VBox(10);
            layout.getChildren().addAll(txtNome, txtEmail, btnCadastrar, mensagem);
            
            Scene scene = new Scene(layout, 300, 200);
            
            stage.setTitle("Cadastro do Membro");
            stage.setScene(scene);
            stage.show();
        } ;           
        
        public static void main(String[] args){
            launch();
        }
        
        };
