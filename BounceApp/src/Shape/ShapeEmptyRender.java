/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 *
 * @author james
 */
public class ShapeEmptyRender implements Renderable{
    private static ShapeEmptyRender instance;
    
    private ShapeEmptyRender(){}
    
    public static ShapeEmptyRender getInstance(){
        if(instance == null){
            instance = new ShapeEmptyRender();
        }
        return instance;
    }
    
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
    
    
}
