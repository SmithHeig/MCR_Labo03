/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceapp;

import Displayer.*;
import Factories.*;
import Shape.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 *
 * @author james
 */
public class BounceApp {

   /** CONSTANTE **/
    private final int NB_CIRCLE = 50;
    private final int NB_SQUARE = 50;
    
    /** ATTRIBUT **/
    private Displayer display;
    private LinkedList<ShapeBouncer> shapes;
    private ShapeFilledFactory shapeFilledFactory;
    private ShapeEmptyFactory shapeEmptyFactory;
    
    /**
     * Constructeur
     */
    public BounceApp(){
        shapes = new LinkedList();
        
        display = AppDisplayer.getInstance(new KeyListener() {
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BounceApp app = new BounceApp();
        app.run();
    }
    
    /**
     * Fonction qui fait bouger les éléments
     */
    public void run(){
        ActionListener actionLinstener = e -> {
            for(ShapeBouncer s : shapes) {
                s.move(display.getWidth(), display.getHeight());
                s.draw(display.getGraphics());
            }
            display.repaint();
        };

        Timer t = new Timer(50, actionLinstener);
        t.start();

    }
    
}
