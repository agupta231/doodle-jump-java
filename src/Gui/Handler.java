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
package Gui;

import Player.Player;
import World.BasicPlatform;
import World.OneTimeUsePlatform;
import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author ankurgupta
 */
public class Handler {
    Player player;
    public LinkedList<BasicPlatform> bp;
    public LinkedList<OneTimeUsePlatform> otp;
    
    public Handler() {
        player = new Player(this);        
        bp = new LinkedList<>();
        otp = new LinkedList<>();
        
        this.init();
    }
    private void init() {
        bp.add(new BasicPlatform(200, 600));
        
        otp.add(new OneTimeUsePlatform(500, 500));
    }
    public void tick() {
        player.tick();
        
        for(int i = 0; i < bp.size(); i++) {
            bp.get(i).tick();
        }
        for(int i = 0; i < otp.size(); i++) {
            otp.get(i).tick();
            if (otp.get(i).hitCounter == 1) {
                otp.remove(i);
            }
        }
    }
    public void render(Graphics g) {
        player.render(g);
        
        for(int i = 0; i < bp.size(); i++) {
            bp.get(i).render(g);
        }
        for(int i = 0; i < otp.size(); i++) {
            otp.get(i).render(g);
        }
    }
}
