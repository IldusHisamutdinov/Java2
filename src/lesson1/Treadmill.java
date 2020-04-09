package lesson1;

public class Treadmill extends Obstacle {
    private String name = "Treadmill";

    public Treadmill(double size) {
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
