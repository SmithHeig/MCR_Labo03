/**
 * @file Displayer.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Displayer;

import java.awt.Graphics2D;

/**
 * Interface representant une afficheur
 */
public interface Displayer
{
    /**
     * Retourne la largeur de l'afficheur
     * @return 
     */
    int getWidth();
    
    /**
     * Retourne la hauteur de l'afficheur
     * @return 
     */
    int getHeight();
    
    /**
     * Retourne l'élément sur lequel dessiner
     * @return Graphics2D
     */
    Graphics2D getGraphics();
    
    /**
     * Raffraichit l'afficheur
     */
    void repaint();
    
    /**
     * Permet de changer le nom de l'afficheur
     * @param s - nom de la fenêtre
     */
    void setTitle(String s);
}
