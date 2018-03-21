/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Shape.Circle;
import Shape.Square;

/**
 *
 * @author james
 */
public abstract class ShapeFactory {  
    public abstract Circle createCircle(int posX, int posY);
    public abstract Square createSquare(int posX, int posY);
}
