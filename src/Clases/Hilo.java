
package Clases;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.*;
import Formularios.Presentacion;
import javax.security.auth.callback.TextOutputCallback;

public class Hilo extends Thread{
    public int num = 0;
    private JProgressBar barra;   
    
    public Hilo (JProgressBar Barra){
        this.barra=Barra;
    }
    
    private void llamarBarra(){        
        if(barra.getValue()<=100){
            num += 3;
            barra.setValue(num);
            barra.setStringPainted(true);           
        }
        else{
            barra.setValue(0);
        }
    }    
    
    @Override
    
    public void run(){
        Presentacion sdf = new Presentacion();        
        while (true) {                       
            try {
                Thread.sleep(120);
                llamarBarra();                            
            } catch (InterruptedException ex) {
            }            
        }
    }
    
}

