/**
 * @file Circle.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.geom.*;


/**
 * @class Circle - Represente un Cercle
 */
public abstract class Circle extends ShapeBouncer{
    /**
     * Constructeur avec paramètres spécifique
     * @param posX Position horizontal du cercle
     * @param posY Position vertical du cercle
     * @param radius Rayon du cercle
     */
    public Circle(double posX, double posY, double radius, Velocity velocity) {
        super(posX, posY, radius, radius, velocity, new Ellipse2D.Double(posX, posY, radius, radius));
    } 
    
    /**
     * Constructeur avec position, taille et vélocité aléatoire
     * @param width largeur de la zone dans lequel la forme sera positionner 
     *  (pour ne pas générer les forme en dehors de la zone)
     * @param height hauteur de la zone dans lequel la forme sera positionner 
     *  (pour ne pas générer les forme en dehors de la zone)
     */
    public Circle(double width, double height){
        this(Math.random() * (width - MAX_SIZE), Math.random() * (height - MAX_SIZE), Math.random() * MAX_SIZE, new Velocity());
    }
}
