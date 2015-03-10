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
import Main.Config;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window {
    public JFrame frame;
    
    public Window(Game game) {
        game.setPreferredSize(new Dimension(Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT));
        game.setMinimumSize(new Dimension(Config.WINDOW_WIDTH,Config.WINDOW_HEIGHT));
        game.setMaximumSize(new Dimension(Config.WINDOW_WIDTH,Config.WINDOW_HEIGHT));
        
        frame = new JFrame(Config.TITLE);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        game.start();
    }
}
