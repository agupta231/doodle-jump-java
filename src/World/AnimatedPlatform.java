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
package World;

import java.awt.Color;

/**
 *
 * @author ankurgupta
 */
public class AnimatedPlatform extends Platform{

    public AnimatedPlatform(int x, int y) {
        super(x, y, PlatformConfig.animatedPlatformColor, 125, "BasicPlatform.png");
    }

    @Override
    public void specialFunction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
