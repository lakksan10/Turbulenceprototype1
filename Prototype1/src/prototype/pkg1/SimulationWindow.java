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
public class SimulationWindow extends GUI{
    
    boolean play;
    
    @Override
    public void show(){
        primaryStage.show();
    }

    SimulationWindow(){
        play = false;
    }
    
    public void play(){
        play = true;
        System.out.println(play);
    }
    
    public void pause(){
        play = false;
        System.out.println(play);
    }
}
