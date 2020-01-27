package com;

public class rectangle extends shape{
	int length,breadth;
	
@Override
	public String toString() {
		return "rectangle [length=" + length + ", breadth=" + breadth + ", shapeId=" + shapeId + ", shapeName="
				+ shapeName + "]";
	}

public rectangle(int shapeId, String shapeName, int length, int breadth) {
		super(shapeId, shapeName);
		this.length = length;
		this.breadth = breadth;
	}

public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

/*public int area()
{
	return length*breadth;
}*/

	double area()
	{
		return length*breadth;
	}

	

}
