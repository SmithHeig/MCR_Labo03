/**
 * @file ShapeFactory.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Factories;

import Shape.Circle;
import Shape.Square;

/**
 * @class ShapeFactory
 * class abstraite pour les fabriques de forme -Singleton
 */
public abstract class ShapeFactory { 
    /**
     * Fabrication de Cercles
     * @param posX Position horiztontal du cercle
     * @param posY Position vertical du cercle
     * @return un cercle à la position donnée en paramètre
     */
    public abstract Circle createCircle(int posX, int posY);
    
    /**
     * Fabrication de Carrés
     * @param posX postion horizontal du cercle
     * @param posY position vertical du cercle
     * @return un Cercle à la position donnée en paramètre
     */
    public abstract Square createSquare(int posX, int posY);
}
