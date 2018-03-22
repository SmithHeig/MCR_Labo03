/**
 * @file ShapeEmptyFactory.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Factories;

import Shape.*;
import Shape.Square;
import java.awt.Color;

/**
 * @class ShapeEmptyFactory
 * Fabrique de forme Vide (que les bordure) - Singleton
 */
public class ShapeEmptyFactory extends ShapeFactory{
    private static ShapeEmptyFactory instance;
    
    /**
     * Constructeur
     */
    private ShapeEmptyFactory(){}
    
    /**
     * getInstance - retourn une instance de l'objet
     * @return ShapeEmptyFactory - retourne la fabrique de forme vide
     */
    public static ShapeEmptyFactory getInstance(){
        if(instance == null){
            instance = new ShapeEmptyFactory();
        }
        return instance;
    }

    /**
     * Creation de cercle
     * @param posX position horizontal du Cercle
     * @param posY position vertical du Cercle
     * @return Une instance d'un cercle
     */
    @Override
    public Circle createCircle(int posX, int posY) {
        return new Circle(posX, posY) {
            
            /**
             * Retourne le Renderer de la forme (permet de le dessiner
             * @return 
             */
            @Override
            public Renderable getRenderer() {
                return ShapeEmptyRender.getInstance();
            }
            
            /**
             * Retourne la couleur de la forme
             * @return Couleur de la forme
             */
            @Override
            public Color getColor() {
                return Color.GREEN;
            }
        };
    }

    /**
     * Creation de Carré
     * @param posX position Hrizontal du carré
     * @param posY position vertical du carré
     * @return Un carré à la position passé en paramètre
     */
    @Override
    public Square createSquare(int posX, int posY) {
        return new Square(posX, posY) {
            /**
             * Retourne le Renderer de la forme (permet de le dessiner
             * @return 
             */
            @Override
            public Renderable getRenderer() {
                return ShapeEmptyRender.getInstance();
            }

            /**
             * Retourne la couleur de la forme
             * @return Couleur de la forme
             */
            @Override
            public Color getColor() {
                return Color.RED;
            }
        };
    }
    
}
