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
package Player;

import Input.KeyInput;
import Main.Setup;
import World.Entity;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author ankurgupta
 */
public class Player implements Entity{
    private Rectangle rect;
    private Color color = PlayerSetup.mainPlayerColor;
    
    public Player() {
        this.rect = new Rectangle(Setup.WINDOW_WIDTH/2 - PlayerSetup.width/2, Setup.WINDOW_HEIGHT/2 - PlayerSetup.height/2, PlayerSetup.width, PlayerSetup.height);
    }
    
    public void tick() {
        if(KeyInput.A == true) {
            this.rect.x -= PlayerSetup.movementSpeed;
        }
        if(KeyInput.D == true) {
            this.rect.x += PlayerSetup.movementSpeed;
        }
    }

    public void render(Graphics g) {
        g.setColor(this.color);
        
        g.drawRect(this.rect.x, this.rect.y, this.rect.width, this.rect.height);
    }
}
