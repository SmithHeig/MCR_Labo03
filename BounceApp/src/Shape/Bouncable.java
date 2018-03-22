/**
 * @file Bouncable.java
 * @author Pier Donini
 * @ModifiedBy James Smith
 * @ModificationDone: 1) Rendre le mouvement indépendant du displayer mais de passé 
 * en paramètre la largeur et la hauteur du contenur dans lequel se trouve la forme
 */
package Shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

/**
 *
 * @author Pier Donini
 */
public interface Bouncable {
    void draw(Graphics2D g);
    void move(int dispWidth, int dispHeight);
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
