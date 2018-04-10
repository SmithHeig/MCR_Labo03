/**
 * @file AppDisplayer.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Displayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 * @class AppDisplayer
 * Singleton qui gère l'affichage
 */
public class AppDisplayer implements Displayer{
    /* CONSTANTE */
    private final static int PREFERED_SIZE = 300; // taille de la fenêtre à la création
    /* ATTRIBUTS */
    private static Displayer instance;  // instance du singleton
    private JFrame frame;               // main frame
    private JPanel panel;               // main panel
    private BufferedImage img;          // image contenant les formes
    
    private AppDisplayer(){
        /** INITIALISATION */
        frame = new JFrame();
        panel = new JPanel();
        
        panel.setPreferredSize(new Dimension(PREFERED_SIZE,PREFERED_SIZE));
        panel.setBackground(Color.WHITE);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);
        
        /* CREATION DE L'IMAGE */
        img = (BufferedImage)panel.createImage(PREFERED_SIZE, PREFERED_SIZE);
        Graphics2D g = img.createGraphics();
        g.drawImage(img, null, PREFERED_SIZE, PREFERED_SIZE);
    }
    
    /**
     * Permet d'initialisé une instance de la classe si existe pas, autrement
     * retour l'instance en cours
     * @return Displayer - L'instance de l'affichage
     */
    public static Displayer getInstance(){
        if(instance == null){
            instance = new AppDisplayer();
        }
        return instance;
    }

    /**
     * Retour la largeur du contenu de la fenêtre
     * @return int - largeur en pixel du panel principale
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * Retour la hauteur du contenu de la fenêtre
     * @return int - hauteur en pixel du panel principale
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * Retourne le graphics sur lequel on va afficher nos élément (notre image)
     * @return Graphics2D - de l'image de fond du panel
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) img.getGraphics();
    }

    /**
     * Permet de raffraichir notre affichage
     */
    @Override
    public void repaint() {
        panel.getGraphics().drawImage(img, 0, 0, null);
        img = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
    }

    /**
     * Changement du nom de la fenêtre
     * @param s - nom de la fenêtre
     */
    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
}
