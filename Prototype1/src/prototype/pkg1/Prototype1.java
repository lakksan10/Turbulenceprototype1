package prototype1.pkg1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Prototype11 extends Application{

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        UserInterface UI= new UserInterface(400,300);
        SimulationWindow SW= new SimulationWindow(700,400);
        UI.show();
        SW.show();
    }
    
}
