package lab1_circle_arrayLists;
import java.awt.*;
import java.util.Scanner;

public class CircleArea {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter radius of a circle: ");
			double radius = input.nextDouble();
			
			double area = Math.PI * Math.pow(radius, 2);
			
			System.out.println("The area of the circle of radius: " + radius + " is: "+ area);	
		}	
	}

