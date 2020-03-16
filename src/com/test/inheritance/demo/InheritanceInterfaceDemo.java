package com.test.inheritance.demo;

class CreateDiagram implements CircleInterface, RectangleInterface,TriangleInterface {

	@Override
	public void drawCircle() {
		System.out.println("this is the interface implementation for the circle");

	}

	@Override
	public void drawRectangle() {
		System.out.println("drawing rectangle ");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public void traingle() {
		System.out.println("draw triangle");
		
	}

}

public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		CreateDiagram obj = new CreateDiagram(); // direct object creation 
		// CircleInterface ref=new CreateDiagram(); //indirect object creation
		obj.drawCircle();
		obj.drawRectangle();
		obj.traingle();

	}

}
