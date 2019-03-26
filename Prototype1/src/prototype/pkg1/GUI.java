/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pkg1;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author 8804
 */
public abstract class GUI {
    protected Stage primaryStage;
    GUI(){
        primaryStage = new Stage();
        
        
        BorderPane bPane = new BorderPane();//Container which is divided into 5 seperate areas(Top,Bottom,Left,Right,Centre) each of these ares can contain a subcomponent
        
        Scene myscene = new Scene(bPane, 400, 250);//New scene is declared and initialised with a preset height and width
        
        this.primaryStage.setScene(myscene);//specifies myscene to be used on the primaryStage
        
        //this.primaryStage.show();//sets visibility to true to display the primarystage to the user
}
    public Stage returnstage(){
        return primaryStage;
}
    public void setTitle(String title){
        this.primaryStage.setTitle(title);//The title of the javafx window is set to User Interface
    }
    
    public abstract void show();
    
}
