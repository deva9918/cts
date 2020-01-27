package com;

public class shape {
	int shapeId;
	String shapeName;
	@Override
	public String toString() {
		return "shape [shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	

	public shape(int shapeId, String shapeName) {
		super();
		this.shapeId = shapeId;
		this.shapeName = shapeName;
	}
		public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	double area()
	{
		return 1;
	}
	
	
}
