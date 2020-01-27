package com;

public class square extends shape {
int side;

@Override
public String toString() {
	return "square [side=" + side + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
}

public square(int shapeId, String shapeName, int side) {
	super(shapeId, shapeName);
	this.side = side;
}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}
double area()
{
	return side*side;
}

}
