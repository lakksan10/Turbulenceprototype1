/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pkg1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
/**
 *
 * @author 8804
 */
public class Prototype1 extends Application{

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
      launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        ControlBox cBox = new ControlBox();
        cBox.setTitle("Controller");
        cBox.show();
    }
    
    
}
