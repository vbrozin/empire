/**
 * model/Carte.java
 *
 * File generated from the Carte uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 2/26/14 2:00:37 PM (February 26, 2014) $
 */
package environment;

// Start of user code to add imports for Carte
 
import agents.Unite;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


// End of user code

/**
 * Description of the class Carte.
 *
 */

public class Carte {
    private int hauteur;
    private int largeur;
    private Map<Point, Case> map = new HashMap<Point, Case>();
    private HashSet<Point> points = new HashSet<Point>();
    // private HashSet<Case> cases;
    // private HashSet<Arete> aretes;

    // Start of user code to add fields for Carte

    // End of user code

    /**
     * Constructor.
     */
    public Carte(String[][] matrix) {
        // Start of user code for constructor Carte
        largeur = matrix[0].length;
        hauteur = matrix.length;
        for(int i=0; i<hauteur; i++)
            for(int j=0; j<largeur; j++) {
                Point p = new Point(i,j);
                points.add(p);
                Case<Point> c = null;
                if(" ".equals(matrix[i][j]))
                    c = new Case(p, false);
                else
                    c = new Case(p, true);
                map.put(p,c);
            }
        // End of user code
    }

    public Case getCase(Unite unite) {
        return null;
    }

    public Map getMap() {
        return map;
    }

    public HashSet<Point> getPoints() {
        return points;
    }

    /**
     * Return hauteur.
     * @return hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Return largeur.
     * @return largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Return largeur.
     * @return largeur
     */
    public Case<Point> getCase(Point p) {
        return map.get(p);
    }



    // Start of user code to add methods for Carte

    // End of user code
}