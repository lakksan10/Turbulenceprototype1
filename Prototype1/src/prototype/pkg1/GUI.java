
package prototype1.pkg1;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GUI {
    private final Stage stage;//Declares a new window or stage that can only be accessed and manipulated within the GUI class. Furthermore, this stage cannot be altered to refer to another object after it has been initialized.
    public BorderPane bPane;//Declares a new container of type BorderPane.

    GUI(int width, int height){
        stage = new Stage();//A new empty window is created
        
        bPane = new BorderPane();//A container which is divided into 5 separate areas(Top,Bottom,Left,Right,Centre) each of these areas can contain a subcomponent
        
        Scene myscene = new Scene(bPane, width, height);//New scene is declared and initialised with a preset height and width
        
        this.stage.setResizable(false);//Makes it so that the user cannot resize the window
        
        this.stage.setScene(myscene);//specifies myscene to be used on the primaryStage
        
    }
    
    
    public void setTitle(String title){
        this.stage.setTitle(title);
    }
    
    public void show(){
        stage.show();
    }
    
}
