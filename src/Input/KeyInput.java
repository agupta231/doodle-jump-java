/*
 * All code is made by the author and is
 * not available for use other than the author
 * and his/her team.
 * 
 * Contact the author for details if you want 
 * to use his/her code.
 * 
 * Any unauthorized use of the author's code will 
 * result in the author having full control over the 
 * usage of the code as well as power to confiscate
 * the code. If this header is found deleted, then all
 * of the penalties mentioned above will apply.   
 * 
 * @author Ankur Gupta
 * @date Jan 12, 2015
 */
package Input;

import Gui.Handler;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
    Handler handler;
    public static boolean A = false;
    public static boolean D = false;
    
    public KeyInput(Handler handler) {
        this.handler = handler;
    }
    public void keyTyped(KeyEvent e) {
        
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_A) {
            KeyInput.A = true;
        }
        if(key == KeyEvent.VK_D) {
            KeyInput.D = true;
        }
    }
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_A) {
            KeyInput.A = false;
        }
        if(key == KeyEvent.VK_D) {
            KeyInput.D = false;
        }
    }
}
