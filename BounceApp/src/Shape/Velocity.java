/**
 * @file Velocity.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

/**
 * @class Velocity
 * Represente un vöcteur
 */
public class Velocity {
    /** ATTRIBUTS **/
    public double x;
    public double y;
    private final double MAX_SPEED = 10;
    
    /**
     * Constructeur
     * Set les attributs aléatoirement
     */
    public Velocity(){
        double angle = Math.toRadians(Math.random() * 360.0);
        double length = Math.random() * MAX_SPEED; //speed
        
        x = Math.cos(angle) * length;
        y = Math.sin(angle) * length;
    }    
}
