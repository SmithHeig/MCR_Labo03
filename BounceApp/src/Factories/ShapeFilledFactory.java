package Factories;
/**
 * @file ShapeFilledFactory.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

import Shape.*;
import java.awt.Color;

/**
 * @class ShapeFilledFactory
 * Fabrique de forme pleine -Singlteon
 */
public class ShapeFilledFactory extends ShapeFactory{
    private static ShapeFilledFactory instance;
    
    /**
     * Constructeur 
     */
    private ShapeFilledFactory(){}
    
    /**
     * getInstance - retourn une instance de l'objet
     * @return ShapeEmptyFactory - retourne la fabrique de forme vide
     */
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

            @Override
            public Color getColor() {
                return Color.BLUE;
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

            @Override
            public Color getColor() {
                return Color.YELLOW;
            }
        };
    }
}
