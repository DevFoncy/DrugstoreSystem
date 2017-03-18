
package Clases;

import Formularios.Presentacion;
import java.awt.SplashScreen;

public class Main {
    
    public static void main(String[] args){
        new Thread(new Presentacion()).start();        
        
    }
    
}
