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
package Physics;

import Main.Setup;
import Player.Player;
import Player.PlayerSetup;

/**
 *
 * @author ankurgupta
 */
public class PlayerGravityHandler {
    private Player player;
    public int threshold;
    private String direction;
    
    public PlayerGravityHandler(Player player) {
        this.player = player;
        this.direction = "up";
    }
    public int calculateY(int currentY) {
        return 21;
    }
    public void resetThreshold() {
        this.threshold = Setup.WINDOW_HEIGHT/2 + PlayerSetup.height;
    }
    public void changeDirection() {
        if(this.direction.equals("up")) {
            this.direction = "down";
        }
        if(this.direction.equals("down")) {
            this.direction = "up";
        }
    }
}
