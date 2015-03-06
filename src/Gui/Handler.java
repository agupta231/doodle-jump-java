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
import Player.Scorer;
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
    Scorer score;
    public static LinkedList<BasicPlatform> bp;
    public static LinkedList<OneTimeUsePlatform> otp;
    
    public Handler() {
        player = new Player(this);
        score = new Scorer();
        Handler.bp = new LinkedList<>();
        Handler.otp = new LinkedList<>();
        
        this.init();
    }
    private void init() {
        Handler.bp.add(new BasicPlatform(200, 600));
        Handler.bp.add(new BasicPlatform(400, 500));
        
        Handler.otp.add(new OneTimeUsePlatform(50, 500));
    }
    public void tick() {
        player.tick();
        score.tick();
        
        for(int i = 0; i < bp.size(); i++) {
            Handler.bp.get(i).tick();
        }
        for(int i = 0; i < otp.size(); i++) {
            Handler.otp.get(i).tick();
            if (Handler.otp.get(i).hitCounter == 1) {
                Handler.otp.remove(i);
            }
        }
    }
    public void render(Graphics g) {
        player.render(g);
        score.render(g);
        
        for(int i = 0; i < bp.size(); i++) {
            Handler.bp.get(i).render(g);
        }
        for(int i = 0; i < otp.size(); i++) {
            Handler.otp.get(i).render(g);
        }
    }
}
