package asteroids;
import processing.core.*;
import java.awt.event.*;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 * This class has very little logic to it. Rather, it creates the PApplet and
 * calls game methods and delegates events to the game class.
 */
public class Main extends PApplet {
    public Game game;
    public Ship ship;
    public Asteroid[] asteroids;
    public List spaceThings;
    public ListIterator li;
    Object x;

    public static void main(String[] args) {
        PApplet.main(new String[] {"asteroids.Main"});
    }


    public void setup() {
        smooth();
        game = new Game(this);
        size(800, 600);
        rectMode(CENTER);
    }

    public void draw() {
        game.draw();
    }


    public void keyPressed(KeyEvent e) {
        game.control("keyDown", e);
    }


    public void keyReleased(KeyEvent e) {
        game.control("keyUp", e);
    }

    public void mousePressed() {
        game.mouseControl();
    }

}
