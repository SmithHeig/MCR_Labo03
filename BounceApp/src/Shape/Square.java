/**
 * @file Square.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.geom.*;

/**
 * @class representant un carré
 */
public abstract class Square extends ShapeBouncer{
    /**
     * Constructeur avec paramètres spécifique
     * @param posX position horizontal de la forme
     * @param posY position vertical de la forme
     * @param size taille d'un coté du carré
     */
    public Square(double posX, double posY, double size, Velocity velocity){
        super(posX, posY, size, size, velocity, new Rectangle2D.Double(posX, posY, size, size));
    }
    /**
     * Constructeur avec position, taille et vélocité aléatoire
     * @param width largeur de la zone dans lequel la forme sera positionner 
     *  (pour ne pas générer les forme en dehors de la zone)
     * @param height hauteur de la zone dans lequel la forme sera positionner 
     *  (pour ne pas générer les forme en dehors de la zone)
     */
    public Square(double width, double height){
        this(Math.random() * (width - MAX_SIZE), Math.random() * (height - MAX_SIZE), Math.random() * MAX_SIZE, new Velocity());
    }
    
}
