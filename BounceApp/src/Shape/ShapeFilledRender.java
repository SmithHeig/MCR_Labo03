/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Graphics2D;

/**
 *
 * @author james
 */
public class ShapeFilledRender implements Renderable{
    private static ShapeFilledRender instance;
    
    private ShapeFilledRender(){}
    
    public static ShapeFilledRender getInstance(){
        if(instance == null){
            instance = new ShapeFilledRender();
        }
        return instance;
    }
    
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
    
}
