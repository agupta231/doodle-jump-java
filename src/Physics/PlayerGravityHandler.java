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
import Player.PlayerSetup;

/**
 *
 * @author ankurgupta
 */
public class PlayerGravityHandler {
    public int threshold;
    private int direction;
    
    public PlayerGravityHandler() {
        this.direction = 1;
        resetThreshold();
    }
    public int calculateY(int currentY) {
        int newY = currentY;
        
        if(currentY + PlayerSetup.height <= this.threshold - PlayerGravitySetup.jumpHeight) {
            changeDirection();
        }
//        else if(currentY >= this.threshold) {
//            changeDirection();
//        }
        if(this.direction == 1) {
            newY = currentY - PlayerGravitySetup.gravitySpeed;
        }
        else if(this.direction == 0) {
            newY = currentY + PlayerGravitySetup.gravitySpeed; 
        }
        
        return newY;
    }
    public void resetThreshold() {
        this.threshold = Setup.WINDOW_HEIGHT/2 + PlayerSetup.height;
    }
    public void changeDirection() {
        if(this.direction == 1) {
            this.direction = 0;
        }
        else if(this.direction == 0) {
            this.direction = 1;
        }
    }
    public void changeThreshold(int newThreshold){
        this.threshold = newThreshold;
    }
}
