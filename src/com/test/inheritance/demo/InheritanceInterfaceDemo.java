package com.test.inheritance.demo;

class CreateDiagram implements CircleInterface,RectangleInterface
{

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

	
}

public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		
		
	
	//	CreateDiagram obj=new CreateDiagram();  //new is the operator 
		
		CircleInterface ref=new CreateDiagram();  //indirect object creation 
		ref.drawCircle();
		
	}

}
