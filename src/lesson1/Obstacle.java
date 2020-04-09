package lesson1;

abstract public class Obstacle {
    protected double size;

    public Obstacle(double size) {
        this.size = size;
    }

    abstract protected double getSize();

    abstract protected String getType();

}
