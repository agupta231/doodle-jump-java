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
 * @date Mar 6, 2015
 */
package Player;

import Entity.Entity;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author ankurgupta
 */
public class Scorer implements Entity{

    public void tick() {
    }

    public void render(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Monacco", Font.PLAIN, 24));
        
        g.drawString(String.valueOf(Score.SCORE), Score.leftPadding, Score.topPadding);
    }
    
}
