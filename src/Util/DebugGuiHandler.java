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
package Util;

/**
 *
 * @author ankurgupta
 */
public class DebugGuiHandler {
    public static boolean debugGUIEnabled = false;
    
    public static void changeDebugGUIStatus() {
        if(DebugGuiHandler.debugGUIEnabled == false) {
            DebugGuiHandler.debugGUIEnabled = true;
        }
        else if(DebugGuiHandler.debugGUIEnabled == true) {
            DebugGuiHandler.debugGUIEnabled = false;
        }
    }
}
