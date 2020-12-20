package com.vorobyev.shape.entity;

public class PyramidProperty {
    private double volume;
    private double area;
    private boolean isIntersectPlane;

    public PyramidProperty() {
        volume = 0;
        area = 0;
    }

    public PyramidProperty(double volume, double area, boolean isIntersectPlane) {
        this.volume = volume;
        this.area = area;
        this.isIntersectPlane = isIntersectPlane;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIntersectPlane() {
        return isIntersectPlane;
    }

    public void setIntersectPlane(boolean intersectPlane) {
        isIntersectPlane = intersectPlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PyramidProperty that = (PyramidProperty) o;

        if (Double.compare(that.volume, volume) != 0) return false;
        if (Double.compare(that.area, area) != 0) return false;
        return isIntersectPlane == that.isIntersectPlane;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(volume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isIntersectPlane ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PyramidProperty{");
        sb.append("volume=").append(volume);
        sb.append(", area=").append(area);
        sb.append(", isIntersectPlane=").append(isIntersectPlane);
        sb.append('}');
        return sb.toString();
    }
}
