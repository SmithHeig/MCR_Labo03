/**
 * @file Renderable.java
 * @author Pier Donini
 * @date 20.03.18
 */
package Shape;

import java.awt.Graphics2D;

/**
 * Interface pour rendre affichable un objet rebondissante (implements Boucable)
 * @author Pier Donini
 */
public interface Renderable {
    /**
     * Affichage de l'objet rebondissant dans un Graphics 2D
     * @param g - le Graphics2D sur lequel l'objet sera dessiner
     * @param b L'objet rebondissance (Bouncable)
     */
    void display(Graphics2D g, Bouncable b);
}
