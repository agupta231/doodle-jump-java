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

import Main.Game;
import Main.Setup;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author ankurgupta
 */
public class Window {
    public Window(Game game) {
        game.setPreferredSize(new Dimension(Setup.WINDOW_WIDTH, Setup.WINDOW_HEIGHT));
        game.setMinimumSize(new Dimension(Setup.WINDOW_WIDTH,Setup.WINDOW_HEIGHT));
        game.setMaximumSize(new Dimension(Setup.WINDOW_WIDTH,Setup.WINDOW_HEIGHT));
        
        JFrame frame = new JFrame(Setup.TITLE);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
