/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Graphics2D;

/**
 *
 * @author james
 */
public interface Renderable {
    void display(Graphics2D g, Bouncable b);
}
