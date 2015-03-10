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
package Main;

import Gui.Handler;
import Input.KeyInput;
import Gui.Window;
import Input.MouseInput;
import Util.DrawImage;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/**
 *
 * @author ankurgupta
 */
public class Game extends Canvas implements Runnable {
    private boolean running = false;
    private Thread thread;
    public static Rectangle Screen;
    
    public static int width;
    public static int height;
    public static Window window;
    
    Handler handler;
    
    public synchronized void start() {
        if(running)
            return;
        
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    private void init() {
        width=getWidth();
        height=getHeight();
        
        handler = new Handler();
        
        this.addMouseListener(new MouseInput(handler));
        this.addKeyListener(new KeyInput(handler));
        Screen = new Rectangle(0, 0, Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
    }
    public void run() {
        init();
        this.requestFocus();
        long lastTime = System.nanoTime();
        double tickCount = 60;
        double nanoSecond = 1000000000 / tickCount;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int ticks = 0;
        int frames = 0;
        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime)/nanoSecond;
            lastTime = now;
            while(delta >= 1) {
                tick();
                ticks++;
                delta--;
            }
            render();
            frames++;
            
            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                System.out.println("TICKS: " + ticks);
                frames = 0;
                ticks = 0;
            }
        }
    }
    
    private void tick() {
        handler.tick();
    }
    
    private void render() {
        BufferStrategy bs =  this.getBufferStrategy();
        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
        DrawImage di = new DrawImage();
        
        g.setColor(Color.white);
//        g.fillRect(0, 0, getWidth(), getHeight());
        handler.render(g);
        
        
        g.dispose();
        bs.show();
    }
    public static void main(String[] args) {
        Game.window = new Window(new Game());
    }
}
