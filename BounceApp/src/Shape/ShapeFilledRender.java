/**
 * @file ShapeFilledRender.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */
package Shape;

import java.awt.Graphics2D;

/**
 * @class ShapeFilledRender
 * Class permettant d'afficher des formes pleines
 * C'est un Singleton
 */
public class ShapeFilledRender implements Renderable{
    private static ShapeFilledRender instance;
    
    /**
     * Constructeur
     */
    private ShapeFilledRender(){}
    
    /**
     * Création ou retour de l'instance en cours du Render
     * @return ShapeFilledRender - nouvelle instance si jamais créé ou celle en cours d'utilisation dans le programme
     */
    public static ShapeFilledRender getInstance(){
        if(instance == null){
            instance = new ShapeFilledRender();
        }
        return instance;
    }
    
    /**
    * Affichage d'une forme rebondissante pleine dans un Graphics2D
    * @param g Graphics2D sur lequel on va dessiner
    * @param b objet à dessiner
    */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
    
}
