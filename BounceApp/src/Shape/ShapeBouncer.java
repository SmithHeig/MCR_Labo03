/**
 * @file Shape.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RectangularShape;
import javax.swing.*;

/**
 * @class abstraite représentant une forme rebondissante
 * Herite de JComponent
 */
public abstract class ShapeBouncer extends JComponent implements Bouncable{
    /** CONSTANTE **/
    protected static final double MAX_SIZE = 20;
    /** ATTRIBUTS **/
    private double posX;
    private double posY;
    
    private double width;
    private double height;
    
    protected RectangularShape shape;
    
    private Velocity velocity; // Vecteur de déplacement
    
    /**
     * Constructeur avec paramètre
     * @param posX
     * @param posY
     * @param width
     * @param height
     * @param shape 
     */
    public ShapeBouncer(double posX,double posY, double width, double height, Velocity velocity, RectangularShape shape){
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.shape = shape;
         
        this.velocity = velocity; // Génération d'un vecteur de déplacement aléatoire
    }
    
    /**
     * Dessiner la forme sur un Graphics
     * @param g Graphics2D sur lequel dessiner la forme
     */
    public void draw(Graphics2D g){
        getRenderer().display(g, this);
    }
    
    /**
     * Déplacement de la forme
     * @param dispWidth - Largeur de l'affichage
     * @param dispHeight - Largeur de l'affichage
     */
    public void move(int dispWidth, int dispHeight){
        posX += velocity.x;
        posY += velocity.y;
        
        if(posX < 0){
            velocity.x = -velocity.x;
            posX = 0;
        }
        if(posX > dispWidth - this.width){
            velocity.x = -velocity.x;
            posX = dispWidth - this.width;
        }
        if(posY < 0){
            velocity.y = -velocity.y;
            posY = 0;
        }
        if(posY > dispHeight - this.height){
            velocity.y = -velocity.y;
            posY = dispHeight - this.height;
        }
        shape.setFrame(posX, posY, width, height);
    }
    
    /**
     * Retourne la position de horizontale de la forme
     * @return double - position sur les axes des x
     */
    public double getPosX(){
        return posX;
    }
    
    /**
     * Retourne la position de verticale de la forme
     * @return double - position sur les axes des y
     */
    public double getPosY(){
        return posY;
    }
    
    public Shape getShape(){
        return shape;
    }
}
