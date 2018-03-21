/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Shape.*;
import Shape.Square;

/**
 * @author james
 */
public class ShapeEmptyFactory extends ShapeFactory{
    private static ShapeEmptyFactory instance;
    
    private ShapeEmptyFactory(){}
    
    public static ShapeEmptyFactory getInstance(){
        if(instance == null){
            instance = new ShapeEmptyFactory();
        }
        return instance;
    }

    @Override
    public Circle createCircle(int posX, int posY) {
        return new Circle(posX, posY) {
            
            @Override
            public Renderable getRenderer() {
                return ShapeEmptyRender.getInstance();
            }
        };
    }

    @Override
    public Square createSquare(int posX, int posY) {
        return new Square(posX, posY) {
            @Override
            public Renderable getRenderer() {
                return ShapeEmptyRender.getInstance();
            }
        };
    }
    
}
