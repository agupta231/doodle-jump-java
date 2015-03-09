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
import Physics.PlayerGravityHandler;
import Entity.Entity;
import Gui.Handler;
import Util.DrawImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author ankurgupta
 */
public class Player implements Entity{
    public static Rectangle rect;
    public static PlayerGravityHandler gravity;
    private Color color = PlayerSetup.mainPlayerColor;
    Handler handler;
    BufferedImage Sprite;
    DrawImage di;
    
    public Player(Handler handler) {
        Player.rect = new Rectangle(Setup.WINDOW_WIDTH/2 - PlayerSetup.width, Setup.WINDOW_HEIGHT/2 - PlayerSetup.height/2, PlayerSetup.width, PlayerSetup.height);
        this.di = new DrawImage();
        this.Sprite = di.load("Player/Player.png");
        Player.gravity = new PlayerGravityHandler();
        this.handler = handler;
    }
    
    public void tick() {
        if(KeyInput.A == true) {
            Player.rect.x -= PlayerSetup.movementSpeed;
        }
        if(KeyInput.D == true) {
            Player.rect.x += PlayerSetup.movementSpeed;
        }
        if(Player.rect.x >= Setup.WINDOW_WIDTH) {
            Player.rect.x = 10;
        }
        if(Player.rect.x <= 0) {
            Player.rect.x = Setup.WINDOW_WIDTH - 10;
        }
        
        Player.rect.y = Player.gravity.calculateY(this.rect.y);
    }

    public void render(Graphics g) {
        g.setColor(this.color);
        
        g.drawImage(Sprite, Player.rect.x, Player.rect.y, Player.rect.width, Player.rect.height, null);
        g.drawRect(Player.rect.x, Player.rect.y, Player.rect.width, Player.rect.height);
    }
}
