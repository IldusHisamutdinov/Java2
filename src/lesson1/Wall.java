package lesson1;

public class Wall extends Obstacle {
    private String name = "Wall";

    public Wall(double size) {
        super(size);
    }

    @Override
    protected double getSize() {
        return this.size;
    }

    @Override
    protected String getType() {
        return this.name;
    }
}