/**
 * @file Bouncable.java
 * @author Pier Donini
 */
package Shape;

import java.awt.Color;
import java.awt.Shape;

/**
 *
 * @author Pier Donini
 */
public interface Bouncable {
    void draw();
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
