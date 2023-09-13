package com.relations;

public class Area {
	Circle c=new Circle(3.3f);
	public static void main(String[] args) {
		Area a=new Area();
		double output=a.c.area();
		System.out.println("area of circle:"+output);
	}

}

class Circle{
	float r;
	Circle(float r){
		this.r=r;
	}
	double area() {
		 double circleArea=3.14*r*r;
		 return circleArea;
	}
}