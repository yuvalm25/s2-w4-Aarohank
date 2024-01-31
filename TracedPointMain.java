import java.awt.*;

public class TracedPointMain{
    public static void main(String[] args) {
        Point p = new Point();
        p.move(10,20);
        System.out.println(p.getX() + ": " + p.getY());
        p.move(100, 10);
        System.out.println(p.getX() + ": " + p.getY());
        TracedPoint t = new TracedPoint(0,0);
        t.move(100,200);
        t.move(200, 100);

    }
}