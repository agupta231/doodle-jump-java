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
 * @date Mar 4, 2015
 */
package World;

/**
 *
 * @author ankurgupta
 */
public class OneTimeUsePlatform extends Platform{
    public int hitCounter;
    
    
    public OneTimeUsePlatform(int x, int y) {
        super(x, y, PlatformConfig.oneTimePlatformColor, 75, "OneTimeUsePlatform.png");
        hitCounter = 0;
    }
    public void specialFunction() {
        hitCounter++;
    }    
}
