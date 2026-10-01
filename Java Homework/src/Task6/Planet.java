package Task6;

public enum Planet {
    MERCURY(3.3011e20, 2.4397e6),
    VENUS(4.8675e21, 6.0518e6),
    EARTH(5.97237e21, 6.371e6),
    MARS(6.4171e20, 3.3895e6),
    JUPITER(1.8982e24, 6.9911e7),
    SATURN(5.6834e23, 5.8232e7),
    URANUS(8.6810e22, 2.5362e7),
    NEPTUNE(1.02413e23, 2.4622e7);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;

    }

    public double getDensity() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return Math.round((mass / volume) * 100.0) / 100.0;
    }

    public double getMass() {
        return Math.round(mass * 100.0) / 100.0;
    }

    public double getRadius() {
        return Math.round(radius * 100.0) / 100.0;
    }
}
