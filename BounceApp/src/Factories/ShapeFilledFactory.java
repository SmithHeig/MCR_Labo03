/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Shape.*;

/**
 *
 * @author james
 */
public class ShapeFilledFactory extends ShapeFactory{
    private static ShapeFilledFactory instance;
    
    private ShapeFilledFactory(){}
    
    public static ShapeFilledFactory getInstance(){
        if(instance == null){
            instance = new ShapeFilledFactory();
        }
        return instance;
    }

    @Override
    public Circle createCircle(int posX, int posY) {
        return new Circle(posX, posY) {
            
            @Override
            public Renderable getRenderer() {
                return ShapeFilledRender.getInstance();
            }
        };
    }

    @Override
    public Square createSquare(int posX, int posY) {
        return new Square(posX, posY) {
            @Override
            public Renderable getRenderer() {
                return ShapeFilledRender.getInstance();
            }
        };
    }
}
