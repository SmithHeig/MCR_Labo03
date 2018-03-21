/**
 * @file Circle.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.Color;
import java.awt.geom.*;
import java.util.Random;

/**
 * @class Circle - Represente un Cercle
 */
public abstract class Circle extends ShapeBouncer{
    /**
     * Constructeur avec paramètres
     * @param posX Position horizontal du cercle
     * @param posY Position vertical du cercle
     * @param radius Rayon du cercle
     */
    public Circle(double posX, double posY, double radius, Velocity velocity) {
        super(posX, posY, radius, radius, Color.BLUE, velocity, new Ellipse2D.Double(posX, posY, radius, radius));
    }   
    
    public Circle(double width, double height){
        this(Math.random() * (width - MAX_SIZE), Math.random() * (height - MAX_SIZE), Math.random() * MAX_SIZE, new Velocity());
    }
}
