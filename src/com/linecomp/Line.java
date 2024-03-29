package com.linecomp;

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
		System.out.println("Welcome to Line Comparison Computation Program: Using OOPs concept");
		Point p1=new Point(1,3);
		Point p2=new Point(201,4);
		Line l=new Line(p1,p2);
		System.out.println("Length of Line is : "+ l.calculateLengthofLine());
		Point p3=new Point(4,500);
		Point p4=new Point(50,6);
		Line l2=new Line(p3,p4);
		if(l.checkEqualityOfLineUsingEquals(l2)){
			System.out.println("Line are equal (Using Equals method)");
		}
		else {
			System.out.println("Line are not equal (Using Equals method)");
		}
		
		System.out.println("Check Equality using  compareTo method ");
		int comparision=l.checkEqualityOfLineUsingCompareTo(l2);
		
		if(comparision==0){
			System.out.println("Line are equal "+comparision);
		}
		else if (comparision>0){
			System.out.println("First line is long  "+comparision);
		}
		else if (comparision<0){
			System.out.println("Second line is long "+comparision);
		}
		
	}
	public boolean checkEqualityOfLineUsingEquals(Line l2) {
		Double lengthOffirstline=Double.valueOf(this.calculateLengthofLine());
		Double lengthOf2ndLine=Double.valueOf(l2.calculateLengthofLine());
		return lengthOffirstline.equals(lengthOf2ndLine);
	}
	public int checkEqualityOfLineUsingCompareTo(Line l2) {
		Double lengthOffirstline=Double.valueOf(this.calculateLengthofLine());
		Double lengthOf2ndLine=Double.valueOf(l2.calculateLengthofLine());
		return lengthOffirstline.compareTo(lengthOf2ndLine);
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

