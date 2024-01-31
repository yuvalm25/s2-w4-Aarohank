/*
 * The new TracedPoint class
 * Don't forget to test this class after you're done making modifications!
 */
 import java.awt.*;

 public class TracedPoint extends Point {
 
     public TracedPoint (int x, int y) {
         super (x, y);
     }
 
     // Your move method goes here.
     public void move(int x, int y){
        System.out.println("Initial point: " + this.getX() + ": " + this.getY());
        super.move(x, y);
        System.out.println("New point: " + this.getX() + ": " + this.getY());

     }
 }