/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

/**
 *
 * @author james
 */
public interface Bouncable {
    void draw(Graphics2D g);
    void move(int dispWidth, int dispHeight);
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
