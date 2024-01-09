package com.linecomp;

import java.util.Calendar;

class Point{
	 int x;
	 int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;	
	}
	
}
public class Line {
	private Point p1;
	private Point p2;
	public Line(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Point p1=new Point(1,2);
		Point p2=new Point(2,2);
		Line l=new Line(p1,p2);
		System.out.println("Length of Line is : "+ l.calculateLengthofLine());
	}
	public double calculateLengthofLine() {
		int x1=this.p1.x;
		int x2=this.p2.x;
		int y1=this.p1.y;
		int y2=this.p2.y;
		
		double length=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
		return length;
		
	}
}

