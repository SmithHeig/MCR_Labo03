/**
 * @file BounceApp.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package bounceapp;

import Displayer.*;
import Factories.*;
import Shape.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 * @class BounceApp
 * Coeur du programme (main)
 */
public class BounceApp {

   /** CONSTANTE **/
    private final static int NB_CIRCLE = 50;
    private final static int NB_SQUARE = 50;
    private final static int TIME_MOVE = 10; // Temps que le timer attant avant de bouger et redessiner les formes
    
    /** ATTRIBUT **/
    private Displayer display;
    private LinkedList<Bouncable> shapes;
    private ShapeFilledFactory shapeFilledFactory;
    private ShapeEmptyFactory shapeEmptyFactory;
    
    /**
     * Constructeur
     */
    public BounceApp(){
        shapes = new LinkedList();
        
        display = AppDisplayer.getInstance();
        
        display.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                return;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
        
                switch(key){
                    case KeyEvent.VK_F: 
                        for(int i = 0; i < NB_CIRCLE; ++i){
                            shapes.add(ShapeFilledFactory.getInstance().createCircle(display.getWidth(), display.getHeight()));
                        }
                        for(int j = 0; j < NB_SQUARE; ++j){
                            shapes.add(shapeFilledFactory.getInstance().createSquare(display.getWidth(), display.getHeight()));
                        }
                        break;
                    case KeyEvent.VK_B:
                        for(int i = 0; i < NB_CIRCLE; ++i){
                            shapes.add(shapeEmptyFactory.getInstance().createCircle(display.getWidth(), display.getHeight()));
                        }
                        for(int j = 0; j < NB_SQUARE; ++j){
                            shapes.add(shapeEmptyFactory.getInstance().createSquare(display.getWidth(), display.getHeight()));
                        }
                        break;
                    case KeyEvent.VK_E:
                        shapes.clear();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                return;
            }
        });
        
    }
    
    /**
     * main - fonction lancé au lancement de l'application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BounceApp app = new BounceApp();
        app.run();
    }
    
    /**
     * Fonction qui fait bouger les formes
     */
    public void run(){
        ActionListener actionLinstener = e -> {
            for(Bouncable s : shapes) {
                s.move();
                s.draw();
            }
            display.repaint();
        };

        Timer t = new Timer(TIME_MOVE, actionLinstener);
        t.start();

    }
    
}
