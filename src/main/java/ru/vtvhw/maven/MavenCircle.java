package ru.vtvhw.maven;

public class MavenCircle {
    private int radius;

    public MavenCircle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MavenCircle{radius=" + radius + "}";
    }
}
