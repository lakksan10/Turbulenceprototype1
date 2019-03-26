/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pkg1;

/**
 *
 * @author 8804
 */
public class ControlBox extends GUI{
    ControlBox(){
        SimulationWindow simWindow = new SimulationWindow();
        simWindow.setTitle("Simulation window");
        simWindow.show();
        
        simWindow.play();
        simWindow.pause();
    }

    @Override
    public void show() {
        primaryStage.show();
    }
}
