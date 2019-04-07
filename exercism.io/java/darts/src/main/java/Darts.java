import java.awt.geom.Point2D;

class Darts {

    private double x, y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double distance = Point2D.distance(0, 0, x, y);

        // The dart goes outside the board
        if (distance > 10)
            return 0;

        // The dart lands within the outer circle
        else if (distance > 5)
            return 1;

        // The dart lands within the middle circle
        else if (distance > 1)
            return 5;

        // The dart lands dead center
        else
            return 10;
    }
}
