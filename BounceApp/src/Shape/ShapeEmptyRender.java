/**
 * @file ShapeEmptyRende.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */
package Shape;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * @class ShapeEmptyRender
 * Class permettant d'afficher des formes vides
 * C'est un Singleton
 */
public class ShapeEmptyRender implements Renderable{
    private static ShapeEmptyRender instance;
    
    /**
     * Constructeur - privé
     */
    private ShapeEmptyRender(){}
    
    /**
     * Création ou retour de l'instance en cours du Render
     * @return ShapeEmptyRender - nouvelle instance si jamais créé ou celle en cours d'utilisation dans le programme
     */
    public static ShapeEmptyRender getInstance(){
        if(instance == null){
            instance = new ShapeEmptyRender();
        }
        return instance;
    }
    
    
   /**
    * Affichage d'une forme rebondissante vide dans un Graphics2D
    * @param g Graphics2D sur lequel on va dessiner
    * @param b objet à dessiner
    */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
    
    
}
