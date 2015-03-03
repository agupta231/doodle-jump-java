package Input;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Gui.Handler;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{
    

    public static Rectangle Mouse= new Rectangle(0, 0, 2, 2);
    public static boolean IsPressed=false;
    public static boolean IsRightClick=false;
    public static boolean IsLeftClick=false;
    
    Handler handler;
            
    public MouseInput(Handler handler){
        this.handler = handler;
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        Mouse.x=e.getX();
        Mouse.y=e.getY();
      

        IsPressed=true;
        if (e.getButton() == MouseEvent.BUTTON3)
        {
            IsRightClick=true;
        }
        if(e.getButton() == MouseEvent.BUTTON1) {
            IsLeftClick = true;
        }
        if(IsRightClick=true){
            
        }
        
    }

    public void mouseReleased(MouseEvent e) {
        IsPressed=false;
        IsRightClick=false;
        IsLeftClick = false;
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }
    
}
