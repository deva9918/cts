package com;

public class circle extends shape {
	double radius;

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}

	public circle(int shapeId, String shapeName, double radius) {
		super(shapeId, shapeName);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	double area()
	{
		return 3.14*radius*radius;
	}
	

}
