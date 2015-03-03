/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MousePositionLocator implements MouseMotionListener{
    
    public static Rectangle MouseLocation = new Rectangle(0, 0, 3, 3);
    public static boolean enableShake=false;
    private Random r = new Random();
    Handler handler;
    public MousePositionLocator(Handler h){
        handler=h;
    }
    
    public void mouseDragged(MouseEvent e) {
        MouseLocation.x=e.getX();
        MouseLocation.y=e.getY();
        enableShake=true;
    }

    
    public void mouseMoved(MouseEvent e) {
        MouseLocation.x=e.getX();
        MouseLocation.y=e.getY();
    }
    
    
    public String RandCol(){
        int rand = r.nextInt(16)+1;
        String character = "";
        if(rand==1){
            character = "1";
        }
        if(rand==2){
            character = "2";
        }
        if(rand==3){
            character = "3";
        }
        if(rand==4){
            character = "4";
        }
        if(rand==5){
            character = "5";
        }
        if(rand==6){
            character = "6";
        }
        if(rand==7){
            character = "7";
        }
        if(rand==8){
            character = "8";
        }
        if(rand==9){
            character = "9";
        }
        if(rand==10){
            character = "0";
        }
        if(rand==11){
            character = "a";
        }
        if(rand==12){
            character = "b";
        }
        if(rand==13){
            character = "c";
        }
        if(rand==14){
            character = "d";
        }
        if(rand==15){
            character = "e";
        }
        if(rand==15){
            character = "f";
        }
        return character;
    }
}
