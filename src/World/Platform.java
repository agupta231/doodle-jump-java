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
 * @date Mar 3, 2015
 */
package World;

import Entity.Entity;
import Player.Player;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Platform implements Entity{
    public Rectangle platform;
    private Color color;
    
    public Platform(int x, int y, Color color) {
        this.platform = new Rectangle(x, y, PlatformSetup.platformWidth, PlatformSetup.platformHeight);
        this.color = color;
    }
    public void changeY(int newY){
        this.platform.y = newY;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void tick() {
        if(Player.rect.intersects(platform)) {
            Player.gravity.changeDirection();
        }
        specialFunction();
    }
    public void render(Graphics g) {
        g.setColor(this.color);
        g.drawRect(this.platform.x, this.platform.y, this.platform.width, this.platform.height);
    }
    public abstract void specialFunction();
}
