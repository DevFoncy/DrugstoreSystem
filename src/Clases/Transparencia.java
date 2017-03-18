
package Clases;

import javax.swing.JFrame;
import com.sun.awt.AWTUtilities;

public class Transparencia {
    
    public void TransCompFrame(JFrame jf){
        
       jf.setUndecorated(true);
       AWTUtilities.setWindowOpaque(jf, false);       
   }
    
}
